package Siralamalar;

public class CountingSort {

    void sort(int arr[]) {
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] count = new int[max + 1];
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        CountingSort ob = new CountingSort();
        int arr[] = { 4, 2, 2, 8, 3, 3, 1 };

        System.out.println("Dizi:");
        printArray(arr);

        ob.sort(arr);

        System.out.println("Sıralı:");
        printArray(arr);
    }
}