package problemler2.soru2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        telefon[] tel = new telefon[3];
        for (int i = 0; i < 3; i++) {
            tel[i] = new telefon(" ", " ", 0);
            System.out.println("Marka: ");
            String marka = giris.nextLine();
            tel[i].setmarka(marka);

            System.out.println("Renk: ");
            String renk = giris.nextLine();
            tel[i].setrenk(renk);

            System.out.println("Yıl: ");
            int yil = giris.nextInt();
            tel[i].setyil(yil);
            giris.nextLine();
            tel[i].yazdir();
            tel[i].arama();
            tel[i].mesaj();
        }
    }
}
