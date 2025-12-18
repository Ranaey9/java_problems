package Siralamalar;

public class InsertionSort {

    public static void insertionSort(int[] d) {
        int t, i, j;
        for (i = 1; i < d.length; i++) {
            t = d[i];
            for (j = i; j > 0 && d[j - 1] > t; j--) {
                d[j] = d[j - 1];
            }
            d[j] = t;

        }
        for (int x : d) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] dizi = { 5, 3, 8, 4, 2 };
        insertionSort(dizi);
    }
}
