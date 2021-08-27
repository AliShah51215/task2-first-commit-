package pl.marczak.lesson4.example.cars;

public interface Drive {

  default void forward() {
    System.out.println("Error");
  }

  void back();

}
