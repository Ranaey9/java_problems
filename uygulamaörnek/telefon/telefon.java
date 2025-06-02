package uygulamaörnek.telefon;

public class telefon {
    private String ad;
    private String marka;
    private String model;
    private double fiyat;

    public telefon(String ad, String marka, String model, double fiyat) {
        this.ad = ad;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void indirimUygula() {
        this.fiyat = this.fiyat * 0.9;
        System.out.println("%10 indirim uygulandı. Yeni fiyat: " + fiyat + " TL");
    }

    public void yazdir() {
        System.out.println("Ad: " + ad);
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Fiyat: " + fiyat + " TL");
    }
}
