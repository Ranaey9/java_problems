package BveBplus;
public class Bplus_Tree {

    static class Dugum {
        int t;
        int[] anahtar;
        Dugum[] cocuk;
        int dugumSayisi;
        boolean yaprak;
        Dugum sonraki;

        Dugum(int t, boolean yaprak) {
            this.t = t;
            this.yaprak = yaprak;
            anahtar = new int[2*t];
            cocuk = new Dugum[2*t+1];
            dugumSayisi = 0;
        }
    }

    Dugum kok;
    int t;

    Bplus_Tree(int t) {
        this.t = t;
        kok = new Dugum(t, true);
    }

    void bol(Dugum ust, int i) {
        Dugum eski = ust.cocuk[i];
        Dugum yeni = new Dugum(t, eski.yaprak);

        int orta = t;

        for (int j = 0; j < t; j++)
            yeni.anahtar[j] = eski.anahtar[j + orta];

        if (!eski.yaprak)
            for (int j = 0; j < t + 1; j++)
                yeni.cocuk[j] = eski.cocuk[j + orta];

        yeni.dugumSayisi = t;
        eski.dugumSayisi = orta;

        if (eski.yaprak) {
            yeni.sonraki = eski.sonraki;
            eski.sonraki = yeni;
        }

        for (int j = ust.dugumSayisi; j >= i + 1; j--)
            ust.cocuk[j + 1] = ust.cocuk[j];

        ust.cocuk[i + 1] = yeni;

        for (int j = ust.dugumSayisi - 1; j >= i; j--)
            ust.anahtar[j + 1] = ust.anahtar[j];

        ust.anahtar[i] = eski.anahtar[orta];
        ust.dugumSayisi++;
    }

    void ekle(int x) {
        Dugum r = kok;
        if (r.dugumSayisi == 2*t) {
            Dugum yeni = new Dugum(t, false);
            kok = yeni;
            yeni.cocuk[0] = r;
            bol(yeni, 0);
            ekleTamOlmayan(yeni, x);
        } else ekleTamOlmayan(r, x);
    }

    void ekleTamOlmayan(Dugum d, int x) {
        int i = d.dugumSayisi - 1;

        if (d.yaprak) {
            while (i >= 0 && x < d.anahtar[i]) {
                d.anahtar[i + 1] = d.anahtar[i];
                i--;
            }
            d.anahtar[i + 1] = x;
            d.dugumSayisi++;
        } else {
            while (i >= 0 && x < d.anahtar[i]) i--;
            i++;
            if (d.cocuk[i].dugumSayisi == 2*t)
                bol(d, i);
            ekleTamOlmayan(d.cocuk[i], x);
        }
    }

    void yapraklariYaz() {
        Dugum p = kok;
        while (!p.yaprak)
            p = p.cocuk[0];

        while (p != null) {
            for (int i = 0; i < p.dugumSayisi; i++)
                System.out.print(p.anahtar[i] + " ");
            p = p.sonraki;
        }
    }

    public static void main(String[] args) {
        Bplus_Tree bp = new Bplus_Tree(2);
        bp.ekle(5);
        bp.ekle(15);
        bp.ekle(25);
        bp.ekle(35);
        bp.ekle(45);
        bp.ekle(55);
        bp.ekle(65);
        bp.yapraklariYaz();
    }
}
