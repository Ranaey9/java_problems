package javaproplems.soru2;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
telefon tlf=new telefon();
System.out.println("marka gir:");
tlf.marka=giris.next();
System.out.println("renk gir:");
tlf.renk=giris.next();
System.out.println("telefon gir:");
tlf.yil=giris.nextInt();
tlf.aramayap();
tlf.mesajgonder();
tlf.yazdir();
}    
}
