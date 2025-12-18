package Siralamalar;
public class Selection {

    public static void selectionSort(int[] d) {

        for (int i = 0; i < d.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < d.length; j++) {
                if (d[j] < d[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = d[i];
            d[i] = d[minIndex];
            d[minIndex] = temp;
        }

        for (int x : d) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {5, 3, 8, 4, 2};
        selectionSort(dizi);
    }
}
