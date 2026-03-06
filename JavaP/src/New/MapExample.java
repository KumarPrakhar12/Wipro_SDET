package New;

import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        
        Map<Integer, String> Employee = new HashMap<>();

       
        Employee.put(101, "Kumar");
        Employee.put(102, "Prakhar");
        Employee.put(103, "Raj");

        System.out.println("Initial Map: " + Employee);

        
        System.out.println("Employee with ID 102: " + Employee.get(102));

        
        System.out.println("Contains key 101? " + Employee.containsKey(101));

        
        System.out.println("Contains value 'Raj'? " + Employee.containsValue("Raj"));

       
        Employee.remove(103);
        System.out.println("After removing key 103: " + Employee);

        
        Employee.putIfAbsent(102, "NewName"); 
        Employee.putIfAbsent(104, "Ankit");   
        System.out.println("After putIfAbsent: " + Employee);

        
        System.out.println("All Employee IDs: " + Employee.keySet());

        
        System.out.println("All Employee Names: " + Employee.values());

       
        System.out.println("All entries:");
        for (Map.Entry<Integer, String> entry : Employee.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

 
