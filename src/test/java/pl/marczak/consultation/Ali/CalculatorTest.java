package pl.marczak.consultation.Ali;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void shouldReturnCorrectSumOfTwoIntegers() {
    //Given
    int value1 = 25;
    int value2 = 100;
    //When
    int resultFromTest =  Calculator.sum(value1, value2);
    //Then
    Assertions.assertEquals(125, resultFromTest);
  }

}