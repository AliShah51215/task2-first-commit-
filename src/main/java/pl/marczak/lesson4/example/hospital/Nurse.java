package pl.marczak.lesson4.example.hospital;

public class Nurse extends Employee{

  String level;

  @Override
  public double earnPayment() {
    return 2*basicPayment;
  }

}
