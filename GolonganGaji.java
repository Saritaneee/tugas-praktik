import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class GolonganGaji {
    public static void main(String[] args) {
        // golongan gaji
        String nama, golongan;
        int gpokok = 0, lembur = 0, totalGaji = 0;

        //Decimal format for Indonesia Rupiah
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        //Set the currency symbol, decimal, and also separator for format symbol Rupiah
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        Scanner keyboard = new Scanner(System.in);

        //Get the input from user
        System.out.println("Nama karyawan= ");
        nama = keyboard.nextLine();
        System.out.println("Golongan [A, B, C]");
        golongan = keyboard.nextLine();
        System.out.println("Lembur= ");
        lembur = keyboard.nextInt();

        //Array for golongan gaji
        int[] gajiGolongan = {5000000, 6500000, 9500000};

        //Golongan
        //Accessing an array using index. For example gajiGolongan[0], it's mean we accessing the index 0 from gajiGolongan array, it was = 5000000
        if (null != golongan){
            switch (golongan) {
                case "A" : case "a" :
                    gpokok = gajiGolongan[0];
                    kursIndonesia.format(gpokok);
                    break;
                case "B" : case "b" :
                    gpokok = gajiGolongan[1];
                    kursIndonesia.format(gpokok);
                 break;
                case "C" : case "c" :
                    gpokok = gajiGolongan[2];
                    kursIndonesia.format(gpokok);
                    break;
                default:
                    break;
            }
        }
       
        //Array for % lembur
        int[] persenLembur = {30, 32, 34, 36, 38};

        //Lembur
        //Accessing an array from persenLembur array using index array
        if (lembur != 0){
            switch (lembur) {
                case 1:
                    totalGaji = gpokok  + (persenLembur[0] * gpokok / 100);
                    kursIndonesia.format(totalGaji);                    
                    break;
                case 2:
                    totalGaji = gpokok + (persenLembur[1] * gpokok / 100);
                    kursIndonesia.format(totalGaji);
                    break;
                case 3:
                    totalGaji = gpokok + (persenLembur[2] * gpokok / 100);
                    kursIndonesia.format(totalGaji);
                    break;
                case 4:
                    totalGaji = gpokok + (persenLembur[3] * gpokok / 100);
                    kursIndonesia.format(totalGaji);
                    break;
                case 5:
                    totalGaji = gpokok + (persenLembur[4] * gpokok / 100);
                    kursIndonesia.format(totalGaji);
                    break;
                default:
                     totalGaji = gpokok + (persenLembur[4] * gpokok / 100);
                     kursIndonesia.format(totalGaji);
                    break;
            }
        } else if (lembur < 1 ) {
            totalGaji = gpokok;
            kursIndonesia.format(totalGaji);
        } 
        
        //Output
        System.out.println("Nama Karyawan= " + nama);
        System.out.println("Golongan gaji= " + golongan);
        System.out.println("Gaji pokok= " + kursIndonesia.format(gpokok));
        System.out.println("Jam lembur= " + lembur);
        System.out.println("Total gaji= " + kursIndonesia.format(totalGaji));
    }
}
