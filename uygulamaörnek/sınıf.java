package uygulamaörnek;

public class sınıf {
    private String isim;
    private String bolum;
    private int not1;
    private int not2;
    private int not3;
    private double ortalama;
private boolean bursdurum;    
public sınıf( String isim, String bolum, int not1, int not2, int not3) {
        this.isim = isim;
        this.bolum = bolum;
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3; 
    }
    public String getIsim() {
        return isim;
    }
    public String getBolum() {
        return bolum;
    }
    public int getNot1() {
        return not1;
    }
    public int getNot2() {
        return not2;
    }

    public int getNot3() {
        return not3;
    }
    public double getOrtalama() {
        return ortalama;
    }
    public void setisim(String isim) {
        this.isim = isim;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public void setNot1(int not1) {
        this.not1 = not1;
    }
    public void setNot2(int not2) {
        this.not2 = not2;
    }
    public void setNot3(int not3) {
        this.not3 = not3;
    }
    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }
  public void setBursdurum() {
    if (ortalama >= 70) {
        this.bursdurum = true;
        System.out.println("Öğrenci burs almaya hak kazandı: " + isim);
    } else {
        this.bursdurum = false;
    }
}

public boolean getBursdurum() {
    return bursdurum;
}
public void hesaplaOrtalama() {
    this.ortalama = (not1 + not2 + not3) / 3.0;
    setBursdurum(); // Ortalama hesaplanınca burs durumu da güncellensin
}
public void yazdir() {
    System.out.println("Öğrenci İsmi: " + isim);
    System.out.println("Bölüm: " + bolum);
    System.out.println("Not 1: " + not1);
    System.out.println("Not 2: " + not2);
    System.out.println("Not 3: " + not3);
    System.out.println("Ortalama: " + ortalama);
    System.out.println("Burs Durumu: " + (bursdurum ? "Alıyor" : "Almıyor"));
}
}