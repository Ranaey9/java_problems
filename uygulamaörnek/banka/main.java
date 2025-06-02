package uygulamaörnek.banka;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        banka kisi1=new banka("ayse", 1, 2000);
        kisi1.paracek(100);
        kisi1.parayatir(300);
        kisi1.bakiyegoster();
        
      banka kisi2=new banka();
      kisi2.setad("ahmet");
     kisi2.setno(2);
     kisi2.setbakiye(3000);
     kisi2.paracek(200);
kisi2.parayatir(500);
kisi2.bakiyegoster();
System.out.println("Ad: " + kisi2.getad());
}
}