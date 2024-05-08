import java.util.Arrays;
import java.util.LinkedList;


public class Praktik {
    public static void main(String[] args) {
        //Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘jumlahBaris’?
        //Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘kalimatBaru’ yang berisi kata ‘Deklarasi tipe data String’?
        //Buatlah pendeklarasian array satu dimensi dengan nama ‘empatAngka’, tipe data integer, yang berisi angka (07, 10, 20, 23)? 
        //Buatlah pendeklarasian array dua dimensi dengan nama ‘alfabet’, tipe data String, 
        //yang terdiri dari tiga baris dan tiga kolom, seperti pada matrik berikut, {p, s, n}, {w, l, b}, {f, r, e}
        //Buatlah deklarasi linked list dengan nama 'listAngka' yang memiliki list (26, 08, 23, 24, 16)?

        int jumlahBaris = 11;
        System.out.println(jumlahBaris);

        String kalimatBaru = "Deklarasi tipe data string";
        System.out.println(kalimatBaru);

        int[] empatAngka = {7, 10, 20, 23};

        for(int element: empatAngka){
            System.out.println(element);
        }

        System.out.println(Arrays.toString(empatAngka));

        String [][] alfabet = {{"p", "s", "n"}, {"w", "l", "b"}, {"f", "r", "e"}};

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(alfabet[i][j]);
            }
            System.out.println();
        }

        LinkedList <Integer> listAngka = new LinkedList<Integer>();
        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);
        
        System.out.println("Linkedlist= " + listAngka);
     }
}
