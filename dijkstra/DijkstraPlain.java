package dijkstra;

public class DijkstraPlain {

    static final int SONSUZ = 999999;

    public static void dijkstra(int[][] grafik, int baslangic) {
        int dugumSayisi = grafik.length;

        int[] mesafe = new int[dugumSayisi];
        boolean[] ziyaretEdildi = new boolean[dugumSayisi];

        // Başlangıç değerleri
        for (int i = 0; i < dugumSayisi; i++) {
            mesafe[i] = SONSUZ;
            ziyaretEdildi[i] = false;
        }
        mesafe[baslangic] = 0;

        for (int adim = 0; adim < dugumSayisi - 1; adim++) {

            // 1) Ziyaret edilmemiş en küçük mesafeli düğümü bul
            int enKucukDugum = -1;
            int enKucukMesafe = SONSUZ;

            for (int i = 0; i < dugumSayisi; i++) {
                if (!ziyaretEdildi[i] && mesafe[i] < enKucukMesafe) {
                    enKucukMesafe = mesafe[i];
                    enKucukDugum = i;
                }
            }

            ziyaretEdildi[enKucukDugum] = true;

            // 2) Komşu düğümlerin mesafesini güncelle
            for (int j = 0; j < dugumSayisi; j++) {
                if (grafik[enKucukDugum][j] != 0 && !ziyaretEdildi[j]) {
                    int yeniMesafe = mesafe[enKucukDugum] + grafik[enKucukDugum][j];
                    if (yeniMesafe < mesafe[j]) {
                        mesafe[j] = yeniMesafe;
                    }
                }
            }
        }

        // SONUÇLAR
        for (int i = 0; i < dugumSayisi; i++) {
            System.out.println("A -> " + i + " mesafe = " + mesafe[i]);
        }
    }

    public static void main(String[] args) {
        int[][] grafik = {
                {0, 2, 0, 4, 1},
                {2, 0, 5, 0, 4},
                {0, 5, 0, 0, 2},
                {4, 0, 0, 0, 3},
                {1, 4, 2, 3, 0}
        };

        dijkstra(grafik, 0); // 0 = A
    }
}
