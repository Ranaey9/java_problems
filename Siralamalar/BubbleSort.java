package Siralamalar;

public class BubbleSort {

    public void bubbel(int[] d) {
        for (int i = 0; i < d.length - 1; i++) {
            for (int j = 0; j < d.length - 1 - i; j++) {
                if (d[j] > d[j + 1]) {
                    int temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {5, 3, 8, 4, 2};

        BubbleSort bs = new BubbleSort();
        bs.bubbel(dizi);
    }
}
