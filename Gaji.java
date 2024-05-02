import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Gaji {
    public static void main(String[] args) {
        // golongan gaji
        String nama, golongan;
        int gpokok = 0, lembur = 0, totalGaji = 0;

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Nama karyawan= ");
        nama = keyboard.nextLine();
        System.out.println("Golongan [A, B, C]");
        golongan = keyboard.nextLine();
        System.out.println("Lembur= ");
        lembur = keyboard.nextInt();

        if(null != golongan){
            switch (golongan) {
                case "A": case "a":
                    gpokok = 5000000;
                    kursIndonesia.format(gpokok);
                    break;
                case "B": case "b":
                    gpokok = 6500000;
                    kursIndonesia.format(gpokok);
                    break;
                case "C": case "c":
                    gpokok = 9500000;
                    kursIndonesia.format(gpokok);
                    break;
                default:
                    break;
            }
        }

        if (lembur != 0){
            switch (lembur) {
                case 1:
                    totalGaji = gpokok  + (30 * gpokok / 100);
                    kursIndonesia.format(totalGaji);                    
                    break;
                case 2:
                    totalGaji = gpokok + (32 * gpokok / 100);
                    kursIndonesia.format(totalGaji);
                    break;
                case 3:
                    totalGaji = gpokok + (34 * gpokok / 100);
                    kursIndonesia.format(totalGaji);
                    break;
                case 4:
                    totalGaji = gpokok + (36 * gpokok / 100);
                    kursIndonesia.format(totalGaji);
                    break;
                case 5:
                    totalGaji = gpokok + (38 * gpokok / 100);
                    kursIndonesia.format(totalGaji);
                    break;
                default:
                     totalGaji = gpokok + (38 * gpokok / 100);
                     kursIndonesia.format(totalGaji);
                    break;
            }
        } else if (lembur < 1 ) {
            totalGaji = gpokok;
            kursIndonesia.format(totalGaji);
        } 
        
        System.out.println("Nama Karyawan= " + nama);
        System.out.println("Golongan gaji= " + golongan);
        System.out.println("Gaji pokok= " + kursIndonesia.format(gpokok));
        System.out.println("Jam lembur= " + lembur);
        System.out.println("Total gaji= " + kursIndonesia.format(totalGaji));


    }
}
