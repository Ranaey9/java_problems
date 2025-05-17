package problemler2;

public class ogrenci {
   private String ad;
   private int no;
   private int sınıf;
   private int kayityili;
   public ogrenci(String ad, int no, int sınıf, int kayityili) {
this.ad=ad;
this.no=no;
this.sınıf=sınıf;
this.kayityili=kayityili;
}
public String getad(){
    return ad;
}
public void setad(String ad){
    this.ad=ad;
}
public int getno(){
    return no;
}
public void setno(int no){
    this.no=no;
}
public int getsınıf(){
    return sınıf;
}
public void setsınıf(int sınıf){
    this.sınıf=sınıf;
}
public void setkaityili(int kayityili){
    this.kayityili=kayityili;
}
public void yazdir(){
    System.out.println("ad: "+ad+"no: "+no+"sınıf: "+sınıf+"kayityili: "+kayityili+"\n");
}
}
