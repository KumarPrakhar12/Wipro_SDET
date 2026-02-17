package New;

import java.util.*;

public class PatientManagement {
	
	public static void main(String[] args)
	{
	LinkedList<String>patients=new LinkedList<>();
	 
	patients.add("Prakhar");
	patients.add("Sodhi");
	patients.add("Tapu");
	patients.add("Taarak");
	patients.add("Daya");
	 
	patients.addFirst("Emergency-Jethalal");
	 patients.addLast("Bhide");
	 
	System.out.println("Patient List:" + patients);
	System.out.println("First Patient :" + patients.getFirst());
	 
	 
	System.out.println("Last Patient :" + patients.getLast());
	 
	System.out.println("Is Jethalal present? " +patients.contains("Jethalal"));
	 
	System.out.println("Postion of Taarak: " +patients.indexOf("Taarak"));
	 
	System.out.println("Treated Patient: " + patients.removeFirst());
	patients.remove("Prakhar");
	 
	System.out.println("Total Remaining Patients: " + patients.size());
	 
	System.out.println("Updated Patient List :");
	 
	for(String patient : patients)
	{
		System.out.println(patient);
	 
	}
	
	if (!patients.isEmpty()) {
        System.out.println("First Patient now: " + patients.get(0));
        System.out.println("Last Patient now: " + patients.get(patients.size() - 1));
    } else {
        System.out.println("No patients left in the queue.");
    }
	}}
	 
	 
	
