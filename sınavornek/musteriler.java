package sınavornek;

public class musteriler {
 
    private String ad;
    private double bakiye;

    public musteriler(String ad, double bakiye) {
        this.ad = ad;
        this.bakiye = bakiye;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(double miktar) {
        if (miktar > 0) {
            this.bakiye += miktar;
            System.out.println(ad + " adlı müşteriye " + miktar + " TL yatırıldı.");
        } else {
            System.out.println("Hatalı para yatırma işlemi.");
        }
    }
  public void yazdir() {
        System.out.println("Müşteri: " + ad + ", Bakiye: " + bakiye + " TL");
    }
    public void paraCek(double miktar) {
        if (miktar <= 0) {
            System.out.println("Çekilecek miktar sıfır ya da negatif olamaz!");
        } else if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye! " + ad + " adlı müşteriden sadece " + bakiye + " TL çekildi.");
            bakiye = 0;
        } else {
           this. bakiye -= miktar;
            System.out.println(ad + " adlı müşteriden " + miktar + " TL çekildi.");
        }
    }

  
    public void  bakiyhesapla(){
if(bakiye==0){
    this.bakiye=0;
}
else if(bakiye>1000){
    System.out.println("bu miktar mevcut:"+bakiye);
    this.bakiye=bakiye;
}
    }
}

