package BveBplus;

public class B_tree {

    static class Dugum {
        int t;
        int[] anahtar;
        Dugum[] cocuk;
        int dugumSayisi;
        boolean yaprak;

        Dugum(int t, boolean yaprak) {
            this.t = t;
            this.yaprak = yaprak;
            anahtar = new int[2 * t - 1];
            cocuk = new Dugum[2 * t];
            dugumSayisi = 0;
        }
    }

    Dugum kok;
    int t;

    B_tree(int t) {
        this.t = t;
        kok = new Dugum(t, true);
    }

    void bol(Dugum ust, int i) {
        Dugum eski = ust.cocuk[i];
        Dugum yeni = new Dugum(t, eski.yaprak);

        yeni.dugumSayisi = t - 1;

        for (int j = 0; j < t - 1; j++)
            yeni.anahtar[j] = eski.anahtar[j + t];

        if (!eski.yaprak)
            for (int j = 0; j < t; j++)
                yeni.cocuk[j] = eski.cocuk[j + t];

        eski.dugumSayisi = t - 1;

        for (int j = ust.dugumSayisi; j >= i + 1; j--)
            ust.cocuk[j + 1] = ust.cocuk[j];

        ust.cocuk[i + 1] = yeni;

        for (int j = ust.dugumSayisi - 1; j >= i; j--)
            ust.anahtar[j + 1] = ust.anahtar[j];

        ust.anahtar[i] = eski.anahtar[t - 1];
        ust.dugumSayisi++;
    }

    void ekle(int x) {
        Dugum r = kok;
        if (r.dugumSayisi == 2 * t - 1) {
            Dugum yeni = new Dugum(t, false);
            kok = yeni;
            yeni.cocuk[0] = r;
            bol(yeni, 0);
            ekleTamOlmayan(yeni, x);
        } else
            ekleTamOlmayan(r, x);
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
            while (i >= 0 && x < d.anahtar[i])
                i--;
            i++;
            if (d.cocuk[i].dugumSayisi == 2 * t - 1) {
                bol(d, i);
                if (x > d.anahtar[i])
                    i++;
            }
            ekleTamOlmayan(d.cocuk[i], x);
        }
    }

    void siraliYaz(Dugum d) {
        int i;
        for (i = 0; i < d.dugumSayisi; i++) {
            if (!d.yaprak)
                siraliYaz(d.cocuk[i]);
            System.out.print(d.anahtar[i] + " ");
        }
        if (!d.yaprak)
            siraliYaz(d.cocuk[i]);
    }

    public static void main(String[] args) {
        B_tree b = new B_tree(2);
        b.ekle(10);
        b.ekle(20);
        b.ekle(5);
        b.ekle(6);
        b.ekle(12);
        b.ekle(30);
        b.ekle(7);
        b.ekle(17);
        b.siraliYaz(b.kok);
    }
}
