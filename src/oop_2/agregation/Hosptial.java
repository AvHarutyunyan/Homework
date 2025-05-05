package oop_2.agregation;

import java.util.ArrayList;
import java.util.List;

public class Hosptial {
    List<Patient> patients;

    Hosptial(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public static void main(String[] args) {
        List<Patient> patients1 = new ArrayList<>();
        patients1.add(new Patient("Jacob"));
        patients1.add(new Patient("brat"));
        Hosptial hosptial = new Hosptial(patients1);

        for (Patient patient : hosptial.getPatients())
            System.out.println(patient.getName());
    }
}

class Patient {
    public String name;

    Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
