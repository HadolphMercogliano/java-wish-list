package org.lessons.java.christmas.Ciclabile;

public class Ciclabile {
  private int[] numbers;
  
  public Ciclabile(int[] numbers) {
    this.numbers = numbers;
  }
  
  public int[] getNumbers() {
    return numbers;
  }
  
  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
  
  
//    methods
  
  public int getElementoSuccessivo(int[] array,int counter) {
  return array[counter];
  }
  public boolean hasAncoraElementi(int[] array, int counter) {
    return counter + 1 < array.length;
  }

}
