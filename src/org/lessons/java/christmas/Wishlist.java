package org.lessons.java.christmas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Wishlist {
  public static void main(String[] args) {
    System.out.println("Lista regali di Natale");
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<String> presents = new ArrayList<>();
    boolean stop = false;
    
    do {
      System.out.println("Inserisci il titolo del regalo (stop per fermarti): ");
      String present = scanner.nextLine();
      
      switch (present) {
        case "stop":
          stop = true;
          break;
        default:
          presents.add(present);
      }
      System.out.println("La lista contiene "+presents.size()+" regali");
    } while (!stop);
    
    scanner.close();
    
    Collections.sort(presents);

    System.out.println("La wishlist contiene: " + presents);
     
  }
}
