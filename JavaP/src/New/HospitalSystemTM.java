package New;




import java.util.TreeMap;


class PatientInfo {

 int id;
 String name;
 int age;
 String disease;

 PatientInfo(int id, String name, int age, String disease) {
     this.id = id;
     this.name = name;
     this.age = age;
     this.disease = disease;
 }


 public String toString() {
     return "ID: " + id +
            ", Name: " + name +
            ", Age: " + age +
            ", Disease: " + disease;
 }
}


public class HospitalSystemTM {

 private TreeMap<Integer, PatientInfo> patients = new TreeMap<>();

 public void addPatient(PatientInfo p) {
     patients.put(p.id, p);
     System.out.println("Patient added");
 }

 public void updatePatient(int id, String name, int age, String disease) {
     if (patients.containsKey(id)) {
         patients.put(id, new PatientInfo(id, name, age, disease));
         System.out.println("Patient updated");
     } else {
         System.out.println("Patient not found");
     }
 }

 public void getPatient(int id) {
     PatientInfo p = patients.get(id);
     if (p != null) {
         System.out.println(p);
     } else {
         System.out.println("Patient not found");
     }
 }

 
 //if (patients.containsKey(id)) {
 //patients.remove(id);

 public void removePatient(int id) {
     if (patients.remove(id) != null) { 
    	 
         System.out.println("Patient removed");
     } else {
         System.out.println("Patient not found");
     }
 }

 public void listAllPatients() {
     if (patients.isEmpty()) {
         System.out.println("No patients available");
         return;
     }
     for (PatientInfo p : patients.values()) {
         System.out.println(p);
     }
 }

 public static void main(String[] args) {

     HospitalSystemTM hs = new HospitalSystemTM();

     hs.addPatient(new PatientInfo(101, "Kumar", 25, "Fever"));
     hs.addPatient(new PatientInfo(103, "Raj", 30, "Cold"));
     hs.addPatient(new PatientInfo(102, "Prakhar", 28, "Flu"));

     System.out.println("\nAll Patients:");
     hs.listAllPatients();

     System.out.println("\nGet Patient 102:");
     hs.getPatient(102);

     System.out.println("\nUpdate Patient 103:");
     hs.updatePatient(103, "Rajesh", 31, "Cough");

     System.out.println("\nRemove Patient 101:");
     hs.removePatient(101);

     System.out.println("\nAll Patients:");
     hs.listAllPatients();
 }
}
