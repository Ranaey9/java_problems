package javaproplems.soru3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        urunler[] urun=new urunler[3];
        for(int i=0;i<3;i++){
            urun [i]=new urunler();
            System.out.println("ürün adını girin");
            urun[i].urunAdi=giris.next();  
            System.out.println("ürün enini girin");
            urun[i].en=giris.nextDouble();
            System.out.println("ürün boyunu girin");
            urun[i].boy=giris.nextDouble();
            System.out.println("ürün yüksekliğini girin");
            urun[i].yukseklik=giris.nextDouble();
            urun[i].Yazdir();
            urun[i].AlanHesapla();
        }

    }
    
}
