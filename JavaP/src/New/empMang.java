package New;

public class empMang {
	
	int id;
	String name;
	double salary;
	public empMang(int id,String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
class Developer extends empMang{
	public Developer(int id, String name, double salary) {
		super(id, name, salary);
	}
	
	
	void display() {
		super.display();
        System.out.println("I'm a Developer");
    }
}
class Manager extends empMang{
	public Manager (int id, String name, double salary) {
		super(id, name, salary);
	}
	void display() {
		super.display();
        System.out.println("I'm not a Manager");
    }
}		
public class Employee {
	public static void main(String[] args) {
		
	Emp e1 = new Developer(100,"Teja",25000);
		Emp e2 = new Manager(103,"Poorna",50000);
		e1.display();
		e2.display();
	}
}

}
