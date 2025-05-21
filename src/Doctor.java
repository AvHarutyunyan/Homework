import oop_2.parent.Parent;

/**
 * 🧪 Վարժություն 1 – Association
 * Ստեղծիր երկու class՝ Doctor և Patient, որտեղ Doctor-ը կատարում է հիվանդի ստուգում՝ առանց պահելու որպես դաշտ։
 *
 * 🔧 Պահանջներ՝
 *
 * Patient class-ը պետք է ունենա անուն։
 *
 * Doctor class-ում լինի method, որը ստանում է Patient object և տպում անունը։
 */
public class Doctor {
  public void bujum(Patient patient){
      System.out.println("The doctor to treat a " + patient.name);
  }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Patient patient = new Patient("Kaxa");
        doctor.bujum(patient);

    }
}
class Patient{
    String name;
    Patient(String name){
        this.name = name;
    }
}
