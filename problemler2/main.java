package problemler2;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    ogrenci[] ogr=new ogrenci[3];
    for(int i=0;i<3;i++){
        ogr[i]=new ogrenci(" ",0,0,0);
        System.out.println("Ad: ");
        String ad=giris.nextLine();
        ogr[i].setad(ad);

        System.out.println("No: ");
        int no=giris.nextInt();
        ogr[i].setno(no);
        System.out.println("Sınıf: ");  
        int sınıf=giris.nextInt();
        ogr[i].setsınıf(sınıf);
        System.out.println("Kayıt Yılı: ");
        int kayityili=giris.nextInt();
        ogr[i].setkaityili(kayityili)   ;  
          giris.nextLine();
        ogr[i].yazdir();
    
    }
            giris.close();
}
}