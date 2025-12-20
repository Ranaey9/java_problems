package Siralamalar;

public class ShellSort{
    public static void sort(int[] dizi) {
        int n = dizi.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                
                int temp = dizi[i];
                int j;
                for (j = i; j >= gap && dizi[j - gap] > temp; j -= gap) {
                    dizi[j] = dizi[j - gap];
                }
                dizi[j] = temp;
            }
        }
    }

    public static void diziYazdir(int[] dizi) {
        for (int sayi : dizi) {
            System.out.print(sayi + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] dizi = { 12, 34, 54, 2, 3, -1, 0, 15, 8 };

        System.out.println("Sıralanmadan Önce:");
        diziYazdir(dizi);

        sort(dizi);

        System.out.println("\nSıralandıktan Sonra (Shell Sort):");
        diziYazdir(dizi);
    }
}