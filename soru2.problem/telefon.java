package problemler2.soru2;

public class telefon {
    private String marka;
    private String renk; 
    private int yil;
    public telefon(String marka, String renk, int yil){
        this.marka=marka;
        this.renk=renk;
        this.yil=yil;
    }
    public String getmarka(){
        return marka;
    }
    public void setmarka(String marka){
        this.marka=marka;
    }
    public String getrenk(){
        return renk;
    }
    public void setrenk(String renk){
        this.renk=renk;
    }
    public int getyil(){
        return yil;
    }
    public void setyil(int yil){
        this.yil=yil;
    }
    public void yazdir(){
        System.out.println("Marka: "+marka);
        System.out.println("Renk: "+renk);
        System.out.println("Yıl: "+yil);
    }
    public void arama(){
        System.out.println("Arama yapılıyor...");
    }
    public void mesaj(){
        System.out.println("Mesaj gönderiliyor...");
    }
}

