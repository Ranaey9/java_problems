package hash;

public class tekraredensayi {

    public static Integer ilktekrar(int[] dizi) {

        int tabloBoyutu = 10;
        int[] hashTablo = new int[tabloBoyutu];

        for (int i = 0; i < tabloBoyutu; i++) {
            hashTablo[i] = -1;
        }

        for (int sayi : dizi) {

            int index = sayi % tabloBoyutu;
            if (index < 0) index += tabloBoyutu;

            if (hashTablo[index] == -1) {
                hashTablo[index] = sayi;
            }
            else {
                if (hashTablo[index] == sayi) {
                    return sayi;
                }

                int yeniIndex = (index + 1) % tabloBoyutu;

                while (true) {

                    if (hashTablo[yeniIndex] == -1) {
                        hashTablo[yeniIndex] = sayi;
                        break;
                    }

                    if (hashTablo[yeniIndex] == sayi) {
                        return sayi;
                    }


                    yeniIndex = (yeniIndex + 1) % tabloBoyutu;
                }
            }
        }

        return null;
    }


    public static void main(String[] args) {
        int[] dizi = {2, 5, 1, 2, 3, 5};
        System.out.println(ilktekrar(dizi)); 
    }
}
