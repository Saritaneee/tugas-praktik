import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

      // 1. Integer declaration
      int jumlahBaris = 11;
      System.out.println("Integer: " + jumlahBaris);

      // 2. String declaration
      String kalimatBaru = "Deklarasi tipe data string";
      System.out.println("String: " + kalimatBaru);

      // 3. Array one dimension declaration
      int[] empatAngka = {7, 10, 20, 23};

      //Print an array using loop method 
      for (int element: empatAngka) {
        System.out.println(element);
      }

      //Print an array using standard library java
      System.out.println(Arrays.toString(empatAngka));

      // 4. Array two dimension declaration
      String[][] alfabet = {
        {"p", "s", "n"},
        {"w", "l", "b"},
        {"f", "r", "e"}
      };

      //Print two dimension array using loop method
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          System.out.print(alfabet[i][j] + " ");
        }
        System.out.println();
      }

      // 5. Linked list declaration
      LinkedList <Integer> listAngka = new LinkedList<Integer>();
      listAngka.add(26);
      listAngka.add(8);
      listAngka.add(23);
      listAngka.add(24);
      listAngka.add(16);

      System.out.println("LinkedList: " + listAngka);
    }
  }