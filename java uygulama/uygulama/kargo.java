package uygulama;

public class kargo {
    private int kod;
    private double agırlık;
    private int gönderitipi; 

    public kargo() {
    }

    public kargo(int kod, double agırlık, int gönderitipi) {
        this.kod = kod;
        this.agırlık = agırlık;
        this.gönderitipi = gönderitipi;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public double getAgırlık() {
        return agırlık;
    }

    public void setAgırlık(double agırlık) {
        this.agırlık = agırlık;
    }

    public int getGönderitipi() {
        return gönderitipi;
    }

    public void setGönderitipi(int gönderitipi) {
        this.gönderitipi = gönderitipi;
    }

    public void kargoBilgi() {
        
        System.out.println("kod: " + kod + " agırlık: " + agırlık + " gönderitipi: " + gönderitipi);
    }

    public double hesapla() {
        double ucret = 0;
        if (gönderitipi == 1) {
            ucret = agırlık * 0.5;
        } else if (gönderitipi == 2) {
            ucret = agırlık * 0.8;
        }
        if (ucret < 20) {
            ucret = 20;
        }
        System.out.println("kargo ücret: " + ucret);
        return ucret;
    }
}