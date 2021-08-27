package pl.marczak.lesson4.example;

import pl.marczak.lesson4.example.cars.Bmw;
import pl.marczak.lesson4.example.cars.Brand;
import pl.marczak.lesson4.example.cars.Car;

public class Main {
  public static void main(String[] args) {
    Car myCar = new Car();
    Car bmw = new Car(4, Brand.BMW,"5");


    myCar.forward();

  }

}
