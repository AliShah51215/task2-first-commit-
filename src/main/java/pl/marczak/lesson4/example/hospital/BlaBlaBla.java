package pl.marczak.lesson4.example.hospital;

import javax.print.Doc;

class BlaBlaBla {
  public static void main(String[] args) {
    Doctor doctor = new Doctor("kids", "12341");
    doctor.setName("Mateusz");
    doctor.setSurname("Marczak");


    Nurse nurse = new Nurse();
    nurse.setName("Helena");
    nurse.setSurname("Basen");
    nurse.level = "Salowa";

//    Employee employee = new Employee();
//    employee.name = "Normal";
//    employee.surname = "Surname";

    System.out.println(doctor.getLicense());
    doctor.setLicense("brak");
    System.out.println(doctor.getLicense());



  }

}
