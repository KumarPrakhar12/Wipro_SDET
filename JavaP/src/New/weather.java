package New;
import java.util.Scanner;

public class weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter city name: ");
	        String city = sc.nextLine();

	        System.out.print("Enter temperature: ");
	        float temp = sc.nextFloat();

	        int threshold = 30;

	        if (temp>threshold) {
	            System.out.println("Condition: Hot Day");
	        } else {
	            System.out.println("Condition: Normal Day");
	        }

	        System.out.println("City: " + city);
	        System.out.println("Temperature: " + temp + "°C");

	        

	}

}
