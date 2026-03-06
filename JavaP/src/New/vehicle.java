package New;

public class vehicle {

	

	interface Vehicle {
	    void start();

	    default void fuelType() {
	        System.out.println("Fueled");
	    }
	}

	class Car implements Vehicle {
	    public void start() {
	        System.out.println("Car started");
	    }
	}

	public class Test {
	    public static void main(String[] args) {
	        Vehicle v = new Car();
	        v.start();
	        v.fuelType();
	    }
	}


}
