package uygulamaörnek.urun;

public class urunler {
  private String ad;
private double fiyat;
private String kategori;
private boolean indirimli;
public urunler(String ad, double fiyat, String kategori) {
    this.ad = ad;
    this.fiyat = fiyat;
    this.kategori = kategori;
    this.indirimli = false; 
}
public String getad(){
    return ad;
}
public void setad(String ad){
    this.ad=ad;
}
public double getfiyat(){
    return fiyat;
}
public String getkategori(){
    return kategori;
}
public void setkategori( String kategori){
    this.kategori=kategori;
}
 public void indirim(String hedefkategori){
    if(hedefkategori==kategori){
        this.fiyat*=0.80;
        this.indirimli=true;
        System.out.println("indirim uygulandı:"+ ad +"yeni fiyat:"+fiyat);
    }
    else{
                System.out.println("indirim uygulanamadı:"+ ad +"yeni fiyat:"+fiyat);

    }
 }
 public void yazdir(){
    System.out.println("ad: "+ad+"fiyat: "+fiyat+"kategori:"+kategori+"indirim: "+indirimli+"\n");
 }
}
