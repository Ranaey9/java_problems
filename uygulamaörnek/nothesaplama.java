package uygulamaörnek;

import java.util.Scanner;

public class nothesaplama {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        sınıf[] ogrenciler = new sınıf[3]; // doğru sınıf adıyla diziyi oluştur

        for (int i = 0; i < 3; i++) {
            System.out.println("Öğrenci " + (i + 1) + " ismini giriniz:");
            String isim = giris.nextLine();

            System.out.println("Öğrenci " + (i + 1) + " bölümünü giriniz:");
            String bolum = giris.nextLine();

            System.out.println("Öğrenci " + (i + 1) + " not1'ini giriniz:");
            int not1 = giris.nextInt();

            System.out.println("Öğrenci " + (i + 1) + " not2'ini giriniz:");
            int not2 = giris.nextInt();

            System.out.println("Öğrenci " + (i + 1) + " not3'ünü giriniz:");
            int not3 = giris.nextInt();
            giris.nextLine(); // Scanner buffer'ını temizle

            // Öğrenci nesnesi oluştur
            ogrenciler[i] = new sınıf(isim, bolum, not1, not2, not3);
            ogrenciler[i].hesaplaOrtalama(); // ortalama ve burs hesapla
            ogrenciler[ i ].yazdir();
        }

    }
}
