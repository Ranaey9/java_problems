package sınavornek;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
    musteriler[] musteriListesi = new musteriler[3];
       
        for (int i = 0; i < 3; i++) {
           musteriListesi[i] = new musteriler("", 0);

            System.out.print("Müşteri adı: ");
            String ad = giris.nextLine();
            musteriListesi[i].setAd(ad);

            System.out.print("Müşteri bakiyesi: ");
            double bakiye = giris.nextDouble();
            giris.nextLine(); 
            musteriListesi[i].setBakiye(bakiye);
        }

    }
}
