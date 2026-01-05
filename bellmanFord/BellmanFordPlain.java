package bellmanFord;

public class BellmanFordPlain {

    static class Kenar {
        int baslangic, bitis, agirlik; // baslangic -> bitis (agirlik)

        Kenar(int baslangic, int bitis, int agirlik) {
            this.baslangic = baslangic;
            this.bitis = bitis;
            this.agirlik = agirlik;
        }
    }

    static final int SONSUZ = 999999;

    public static void main(String[] args) {

        int dugumSayisi = 5;
        int baslangicDugumu = 0;

        Kenar[] kenarlar = {
                new Kenar(0, 1, 2),
                new Kenar(0, 3, 4),
                new Kenar(0, 4, 1),
                new Kenar(1, 2, 5),
                new Kenar(1, 4, 4),
                new Kenar(2, 4, 2),
                new Kenar(3, 4, 3)
        };

        int[] mesafe = new int[dugumSayisi];

        // Başlangıç değerleri
        for (int i = 0; i < dugumSayisi; i++)
            mesafe[i] = SONSUZ;
        mesafe[baslangicDugumu] = 0;

        // |V| - 1 kez tüm kenarları dolaş
        for (int i = 0; i < dugumSayisi - 1; i++) {
            for (Kenar k : kenarlar) {
                if (mesafe[k.baslangic] + k.agirlik < mesafe[k.bitis]) {
                    mesafe[k.bitis] = mesafe[k.baslangic] + k.agirlik;
                }
            }
        }

        // NEGATİF DÖNGÜ KONTROLÜ
        for (Kenar k : kenarlar) {
            if (mesafe[k.baslangic] + k.agirlik < mesafe[k.bitis]) {
                System.out.println("Negatif döngü tespit edildi!");
            }
        }

        // Sonuçlar
        for (int i = 0; i < dugumSayisi; i++) {
            System.out.println("A -> " + i + " mesafe = " + mesafe[i]);
        }
    }
}
