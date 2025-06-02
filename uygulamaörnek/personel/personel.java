package uygulamaörnek.personel;

import java.security.PublicKey;

import javafx.stage.PopupBuilder;

public class personel {
   private String ad;
private double maas;
private int baslangicYili;
private String pozisyon;
public personel(String ad, double maas, int baslangicYili) {
    this.ad = ad;
    this.maas = maas;
    this.baslangicYili = baslangicYili;
    this.pozisyon = "yeni";
}
public String getAd() {
    return ad;

}
public void setAd(String ad) {
    this.ad = ad;
}
public double getMaas() {
    return maas;
}
public void setMaas(double maas) {
    this.maas = maas;
}
public int getBaslangicYili() {
    return baslangicYili;
}
public void setBaslangicYili(int baslangicYili) {
    this.baslangicYili = baslangicYili;
}
public String getPozisyon() {
    return pozisyon;
}
public void setPozisyon(String pozisyon) {
    this.pozisyon = pozisyon;
}
public void maasgucele(int mevcutyil){
    mevcutyil=2025;
    if(mevcutyil-baslangicYili>5){
        this.maas = this.maas * 1.10; // %10 zam
        this.pozisyon = "Kıdemli "; // pozisyonu güncelle
        System.out.println("Zam yapıldı: " + ad + " yeni maaş: " + maas);
    }
    else{
        this.pozisyon="yeni"; // pozisyonu güncelle
            System.out.println("Zam yapılmadı: " + ad + " henüz kıdemli değil");
    }
}
public void yazdir(){
    System.out.println("Ad: " + ad);
    System.out.println("Maaş: " + maas);
    System.out.println("Başlangıç Yılı: " + baslangicYili);
    System.out.println("Pozisyon: " + pozisyon);
}
}