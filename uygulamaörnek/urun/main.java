package uygulamaörnek.urun;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    urunler[] urun1=new urunler[2];
    for(int i=0;i<2;i++){
        System.out.println("ad gir");
      String ad =giris.nextLine();
System.out.println("fiyat");
double fiyat=giris.nextDouble();
System.out.println( "kategori");
String kategori=giris.nextLine();
giris.nextLine();
urun1[i]=new urunler(ad, fiyat, kategori);
urun1[i].indirim(kategori);
urun1[i].yazdir();
    }
  }  
}
