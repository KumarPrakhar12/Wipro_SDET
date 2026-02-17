package New;
import java.util.Scanner;
public class s_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter student name: ");
        
        String name = sc.nextLine();

        System.out.print("Enter marks in English: ");
        int english = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        
        int total = english+maths;
        float percentage = (total / 200.0f) * 100;

       
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        
        System.out.println("Student:" + name);
        
        System.out.println("English:" + english);
        
        System.out.println("Maths:" + maths);
        
        System.out.println("Total:" + total);
        
        System.out.println("Percentage:" + percentage + "%");
        System.out.println("Grade:" + grade);
	         

	}

}


