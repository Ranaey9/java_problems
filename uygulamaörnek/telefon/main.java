package uygulamaörnek.telefon;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Telefon adı girin: ");
        String ad = giris.nextLine();
        System.out.print("Marka girin: ");
        String marka = giris.nextLine();
        System.out.print("Model girin: ");
        String model = giris.nextLine();
        double fiyat = 7000;

        telefon tel = new telefon(ad, marka, model, fiyat);
        tel.yazdir();
        tel.indirimUygula();
        tel.yazdir();
    }
}
