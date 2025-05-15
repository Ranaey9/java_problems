package javaproplems.soru4;

import java.util.Scanner;

import javaproplems.soru4.not;

public class main {
   public static void main(String[] args) {
    Scanner giris = new Scanner(System.in);
            not[] exam = new not[3]; // 3 öğrenci

    double sum=0;
for(int i=0;i<3;i++){
    exam[i]=new not();
    System.out.println("Adını girin");
    exam[i].ad=giris.next();
    System.out.println("Vize notunu girin");
    exam[i].vize=giris.nextDouble();
    System.out.println("Final notunu girin");
    exam[i].finalNotu=giris.nextDouble();
   double ort=exam[i].NotHesapla();
    System.out.println("Ortalama : "+ort+"\n");
    sum+=ort;
    exam[i].yazdir();

}  double genelort=sum/3;
  System.out.println("Genel Ortalama : "+genelort+"\n");
   } 
}
