package FLOYDWARSHALL;

public class FloydWarshallPlain {

    static final int SONSUZ = 999999;

    public static void main(String[] args) {

        int[][] grafik = {
                {0, 2, SONSUZ, 4, 1},
                {2, 0, 5, SONSUZ, 4},
                {SONSUZ, 5, 0, SONSUZ, 2},
                {4, SONSUZ, SONSUZ, 0, 3},
                {1, 4, 2, 3, 0}
        };

        int dugumSayisi = grafik.length;

        int[][] mesafe = new int[dugumSayisi][dugumSayisi];

        // Başlangıç mesafe matrisini kopyala
        for (int i = 0; i < dugumSayisi; i++) {
            for (int j = 0; j < dugumSayisi; j++) {
                mesafe[i][j] = grafik[i][j];
            }
        }

        // Floyd–Warshall ana algoritması
        for (int araDugum = 0; araDugum < dugumSayisi; araDugum++) {
            for (int baslangic = 0; baslangic < dugumSayisi; baslangic++) {
                for (int bitis = 0; bitis < dugumSayisi; bitis++) {

                    if (mesafe[baslangic][araDugum] + mesafe[araDugum][bitis]
                            < mesafe[baslangic][bitis]) {

                        mesafe[baslangic][bitis] =
                                mesafe[baslangic][araDugum] + mesafe[araDugum][bitis];
                    }
                }
            }
        }

        // SONUÇLAR
        System.out.println("En kısa yol matrisi:");
        for (int i = 0; i < dugumSayisi; i++) {
            for (int j = 0; j < dugumSayisi; j++) {
                if (mesafe[i][j] == SONSUZ)
                    System.out.print("INF ");
                else
                    System.out.print(mesafe[i][j] + " ");
            }
            System.out.println();
        }
    }
}
