package org.lessons.java.christmas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Wishlist {
  
  private final static String filePath = "wishlist.txt";
  
  public static void main(String[] args) {
    System.out.println("Lista regali di Natale");
    
//    provo a leggere la lista se esistente.
    try (Scanner reader = new Scanner(new File(filePath))) {
      System.out.println("La lista contiene i seguenti regali: ");
//      finchè c'è una nuova riga'
      while (reader.hasNextLine()) {
//        leggi la prossima riga
        String line = reader.nextLine();
//        stampa la prossima riga
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Lista non trovata");
    }
    
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<String> presents = new ArrayList<>();
    boolean stop = false;
    
    do {
      System.out.println("Inserisci un regalo (stop per fermarti): ");
      String present = scanner.nextLine();
      
      switch (present) {
        case "stop":
          stop = true;
          break;
        default:
          presents.add(present);
      }
      
      if (presents.size() != 1) System.out.println("La lista contiene " + presents.size() +" regali");
      else System.out.println("La lista contiene "+ presents.size() + " regalo");
      
    } while (!stop);
    
    scanner.close();
    
    Collections.sort(presents);

    System.out.println("La wishlist contiene: " + presents);
    
    FileWriter writer = null;
    try {
      writer = new FileWriter(filePath);
      
      for (String present : presents) {
        writer.write(present + "\n");
      }
    } catch (IOException e) {
    System.out.println("Impossibile scrivere su file");
  } finally {
    try {
      writer.close();
    } catch (NullPointerException e) {
      e.printStackTrace();
    } catch (IOException ne) {
      ne.printStackTrace();
    }
  }
  
}
}
