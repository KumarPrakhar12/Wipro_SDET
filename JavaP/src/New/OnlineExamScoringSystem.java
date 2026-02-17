package New;
import java.util.*;
public class OnlineExamScoringSystem {
	
	public static void main(String[] args) {

       
        Map<String, Integer> marks = new HashMap<String, Integer>();

        
        marks.put("Maths", 60);
        marks.put("Physics", 75);
        marks.put("English", 85);
        marks.put("Chemistry", 70);

        System.out.println("Student Exam Scores");

        int total = 0;

        
        for (String subject : marks.keySet()) {

            Integer score = marks.get(subject); 
            System.out.println(subject + " : " + score);

            total = total + score;  
        }

        
        int totalSubjects = marks.size();
        
        double avg = total / totalSubjects;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }

}
