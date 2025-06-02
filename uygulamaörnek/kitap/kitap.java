package uygulamaörnek.kitap;

public class kitap {
  private String ad;
    private String yazar;
    private int sayfaSayisi;
    private int basimyili;  

    public  kitap(String ad,String yazar,int sayfaSayisi,int basimyili){
        this.ad=ad;
        this.yazar=yazar;
        setSayfaSayisi(sayfaSayisi);
        this.basimyili=basimyili;
    }
    public String getAd() {
        return ad;
    }
    public String getYazar() {
        return yazar;
    }
    public int getSayfaSayisi() {
        return sayfaSayisi;
    }
    public int getBasimYili() {
        return basimyili;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setYazar(String yazar) {
        this.yazar = yazar;
    }
    public void setSayfaSayisi(int sayfaSayisi) {
        if(sayfaSayisi <= 0){
            System.out.println("sayfa sayısı 0dan küçük olamaz.");
            return;
        }
        this.sayfaSayisi = sayfaSayisi;
    }
    public void setBasimYili(int basimyili) {
        this.basimyili = basimyili;
    }
//mevcut yildan basimyili çıakrtacaz
public int kitapYasi() {
        int mevcutYil = 2025;
        return mevcutYil - basimyili;
    }
  

public void yazdir(){
    if(sayfaSayisi>300){
System.out.println("Ad: " + ad + ", Yazar: " + yazar + ", Sayfa: " + sayfaSayisi + ", Basım: " + basimyili);
    }
}
}