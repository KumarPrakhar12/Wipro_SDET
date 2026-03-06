package New;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {

        
        TreeMap<Integer, String> employees = new TreeMap<>();

        
        employees.put(103, "Raj");
        employees.put(101, "Kumar");
        employees.put(105, "Ankit");
        employees.put(102, "Prakhar");
        employees.put(104, "Ravi");

        System.out.println("TreeMap: " + employees); 
        

        
        System.out.println("Employee with ID 103: " + employees.get(103));

      
        System.out.println("Contains key 102? " + employees.containsKey(102));
        System.out.println("Contains value 'Ravi'? " + employees.containsValue("Ravi"));

       
        employees.remove(105);
        System.out.println("After removing key 105: " + employees);

       
        System.out.println("First key: " + employees.firstKey());
        System.out.println("Last key: " + employees.lastKey());

        
        System.out.println("All keys: " + employees.keySet());
        System.out.println("All values: " + employees.values());
        System.out.println("All entries:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

       
        System.out.println("SubMap 102 to 104: " + employees.subMap(102, 105));
        System.out.println("HeadMap < 103: " + employees.headMap(103));
        System.out.println("TailMap >= 103: " + employees.tailMap(103));

       
        System.out.println("Descending map: " + employees.descendingMap());
    }
}

