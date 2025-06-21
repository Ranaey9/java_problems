package uygulama;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        kargo[] a1 = new kargo[3];
       
        for (int i = 0; i < 3; i++) {
            a1[i] = new kargo();
            System.out.print("Kod gir: ");
            int kod = giris.nextInt();
            System.out.print("Ağırlık gir: ");
            double agırlık = giris.nextDouble();
            System.out.print("Gönderi tipini seç (1:standart,2: hızlı");
            int gönderitipi = giris.nextInt();
            a1[i].setKod(kod);
            a1[i].setAgırlık(agırlık);
            a1[i].setGönderitipi(gönderitipi);
            a1[i].kargoBilgi();
            a1[i].hesapla();
            System.out.println();
        }
    }
}