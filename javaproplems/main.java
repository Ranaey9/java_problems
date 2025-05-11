package javaproplems;

import java.util.Scanner;

public class main {
 public static void main(String[] args) {
Scanner giris = new Scanner(System.in);
ogrenci[] ogr=new ogrenci[3];
for(int i=0;i<3;i++){
ogr[i]=new ogrenci();//dizi nesnesi oluştur
System.err.println("lütfen no gir");
ogr[i].no=giris.nextInt();
System.err.println("lütfen ad gir");
ogr[i].ad=giris.next();
System.err.println("lütfen sinifi gir");
ogr[i].sinif=giris.nextInt();
System.err.println("lütfen kayit yili girin");
ogr[i].kayityili=giris.nextInt();
ogr[i].yazdir();
}
 }
}
