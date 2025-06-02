package uygulamaörnek.banka;

public class banka {
   private String ad;
   private int no;
   private int bakiye;
   public banka(String ad,int no,int bakiye){
    this.ad=ad;
    this.no=no;
    this.bakiye=bakiye;
   }
   public banka(){
    this.ad="ad";
    this.no=0;
    this.bakiye=0;
   }
   public String getad() {
    return ad;
   }
   public void setad(String ad){
    this.ad=ad;
   }
      public int getno() {
    return no;
   }
   public void setno(int no){
    this.no=no;
   }
      public int getbakiye() {
    return bakiye;
   }
   public void setbakiye(int bakiye){
    if(bakiye>0){
    this.bakiye=bakiye;
   }
   }
   public void paracek(int tutar){
    if(bakiye>0){
        this.bakiye-=tutar;
        System.out.println("tutar cikarildi"+tutar);
    }
    else{
        System.out.println("tutar eksik");
    }
   }
   public void parayatir(int tutar){
    if(bakiye>0){
        this.bakiye+=tutar;
        System.out.println("tutar eklendi"+tutar);
    }
   }
   public void bakiyegoster(){
    System.out.println("ad: "+ad+"no: "+no+"bakiye: "+bakiye+"\n");
   }
}
