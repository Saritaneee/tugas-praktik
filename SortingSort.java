import java.util.Arrays;

public class SortingSort{
    void countSort(int array[], int size) {
        int[] output = new int[size + 1];


        int max = array[0];
        for (int i = 1; i < size; i++) {
            if(array[i] > max)
            max = array[i];
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }


        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }


        for (int i = 1; i <= max; i++) {
            count[i] += count [i - 1];
        }


        for (int i = size - 1;  i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }


        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }


    public static void main(String args[]) {
            int[] data = { 6, 5, 3, 4, 1, 2};
            System.out.println("given array is= " + Arrays.toString(data));
            int size = data.length;
            SortingSort cs = new SortingSort();
            cs.countSort(data, size);
            System.out.println("Pengurutan data dari yang terkecil ke yang terbesar");
            System.out.println(Arrays.toString(data));
    }

}