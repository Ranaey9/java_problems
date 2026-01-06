package hash;

public class hash {

    public static void main(String[] args) {
        int[] dizi = { 10, 20, 10, 5, 20, 10 };

        int tabloBoyutu = 100; 
        int[] hashDeger = new int[tabloBoyutu];
        int[] hashFrekans = new int[tabloBoyutu];

        for (int i = 0; i < tabloBoyutu; i++) {
            hashDeger[i] = -1;
        }
        for (int i = 0; i < dizi.length; i++) {

            int sayi = dizi[i];
            int index = sayi % tabloBoyutu;

            if (index < 0)
                index += tabloBoyutu;

            if (hashDeger[index] == -1) {
                hashDeger[index] = sayi;
                hashFrekans[index] = 1;
            } else {
                if (hashDeger[index] == sayi) {
                    hashFrekans[index]++;
                } else {
                    int yeniIndex = (index + 1) % tabloBoyutu;
                    while (true) {
                        if (hashDeger[yeniIndex] == -1) {
                            hashDeger[yeniIndex] = sayi;
                            hashFrekans[yeniIndex] = 1;
                            break;
                        }
                        if (hashDeger[yeniIndex] == sayi) {
                            hashFrekans[yeniIndex]++;
                            break;
                        }
                        yeniIndex = (yeniIndex + 1) % tabloBoyutu;
                    }
                }
            }
        }
        for (int i = 0; i < tabloBoyutu; i++) {
            if (hashDeger[i] != -1) {
                System.out.println(hashDeger[i] + " -> " + hashFrekans[i]);
            }
        }
    }
}
//      index:   0 1 2 3 4 5 6 7 8 9
//  hashDeger:  -1-1-1-1-1-1-1-1-1-1
// hashFrekans:  0 0 0 0 0 0 0 0 0 0