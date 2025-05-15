package javaproplems.soru4;

public class not {
        String ad;
        double vize;
        double finalNotu;
    
        // Ortalama hesaplayan metod
        double NotHesapla() {
            return (vize * 0.4) + (finalNotu * 0.6);
        }
    public void yazdir() {
            System.out.println("Ad: " + ad);
            System.out.println("Vize Notu: " + vize);
            System.out.println("Final Notu: " + finalNotu);
            System.out.println("Ortalama: " + NotHesapla());
        }
}
