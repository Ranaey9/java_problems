package javaproplems.soru3;

public class urunler {
    String urunAdi;
    double en, boy, yukseklik;
    void Yazdir() {
        System.out.println("Ürün Adı: " + urunAdi);
        System.out.println("En: " + en);
        System.out.println("Boy: " + boy);
        System.out.println("Yükseklik: " + yukseklik);
    }
    double AlanHesapla() {
        return en * boy; 
    }
}