package New;

public class empolyeeUseCase {

    
    private int salary;

   
    public void setSalary(int salary) {
        this.salary = salary;
    }

   
    public int getSalary() {
        return salary;
    }

    
    public static void main(String[] args) {
        empolyeeUseCase emp = new empolyeeUseCase();

        emp.setSalary(100000);

        System.out.println("Salary of employee: " + emp.getSalary());
    }
}
