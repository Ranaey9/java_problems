package uygulamaörnek.kitap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
    kitap[] k1=new kitap[3];
    int sum=0;
    int ort;
    for(int i=0;i<3;i++){
        System.out.println("Kitap Adı: ");
        String ad=giris.nextLine();
        System.out.println("Yazar: ");
        String yazar=giris.nextLine();
        System.out.println("Sayfa Sayısı: ");
        int sayfaSayisi=giris.nextInt();
        System.out.println("Basım Yılı: ");
        int basimYili=giris.nextInt();
        giris.nextLine(); 
        k1[i]=new kitap(ad,yazar,-15,basimYili);
        
        k1[i].kitapYasi();
        sum+=k1[i].getSayfaSayisi();
        ort=sum/3; 
        System.out.println("Ortalama Sayfa Sayısı: " + ort);
        k1[i].yazdir();       
    }
 }
}
