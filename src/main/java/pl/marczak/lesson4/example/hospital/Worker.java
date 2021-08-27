package pl.marczak.lesson4.example.hospital;

public class Worker extends Employee {

  @Override
  public double earnPayment() {
    return basicPayment;
  }

}
