package javaproplems.soru2;

public class telefon {
    String marka;
    String renk;
    int yil;
    
    public void aramayap(){
        System.out.println(marka+"arama yapıldı.."+"\n");
    }
    public void mesajgonder(){
        System.out.println(marka+"mesaj gönderildi.."+"\n");
    }
    public void yazdir(){
        System.out.println("Marka : "+marka+"\nRenk : "+renk+"\nYil : "+yil+"\n");
    }
}
