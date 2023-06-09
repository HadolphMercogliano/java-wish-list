package org.lessons.java.christmas.Ciclabile;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int counter=0;
   int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Ciclabile cic = new Ciclabile(numbers);
    
    while(cic.hasAncoraElementi(cic.getNumbers(), counter)) {
    System.out.println("Digita 1 per sapere se c'è un altro numero in lista");
    System.out.println("Digita 2 se vuoi il prossimo numero in lista");
    Scanner scanner = new Scanner(System.in);
    int choise = scanner.nextInt();
    
    
    switch (choise) {
      case 1: {
        if (cic.hasAncoraElementi(cic.getNumbers(), counter)) {
          System.out.println("é presente un altro numero in lista");
          break;
        } else {
          System.out.println("Non é presente un altro numero in lista");
          break;
        }
      }
      case 2: {
        System.out.println("il numero è " + cic.getElementoSuccessivo(cic.getNumbers(), counter));
        counter++;
        break;
      }
    }
    
    }
  }
}
