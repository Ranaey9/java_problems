package uygulamaörnek.personel;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        personel[] pers = new personel[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Personel bilgilerini giriniz:");
            System.out.print("Ad: ");
            String ad = giris.nextLine();
            System.out.print("Maaş: ");
            double maas = giris.nextDouble();
            System.out.print("Başlangıç Yılı: ");
            int baslangicYili = giris.nextInt();
            giris.nextLine(); // dummy newline

            // Pozisyon girilmiyor, "Yeni" olarak ayarlanıyor
            pers[i] = new personel(ad, maas, baslangicYili);

            pers[i].maasgucele(2025); // doğru metot adıyla
            pers[i].yazdir();
        }

    }
}
