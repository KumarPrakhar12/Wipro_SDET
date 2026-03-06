package New;
import java.util.*;

class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Patient p = (Patient) obj;
        return this.id == p.id;
    }

    public int hashCode() {
        return id;
    }
}

public class HospitalSystem {

    public static void main(String[] args) {

        HashSet<Patient> patients = new HashSet<>();

        addPatient(patients, new Patient(1, "Prakhar"));
        addPatient(patients, new Patient(2, "Kumar"));
        addPatient(patients, new Patient(1, "Navin"));

        System.out.println("\nRegistered Patients:");
        for (Patient p : patients) {
            System.out.println(p.id + " " + p.name);
        }
    }

    static void addPatient(HashSet<Patient> patients, Patient p) {
        if (patients.add(p)) {
            System.out.println("Patient added to the system");
        } else {
            System.out.println("Already registered");
        }
    }
}
