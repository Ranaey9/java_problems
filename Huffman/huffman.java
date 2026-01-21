package Huffman;

public class huffman {

    static class Node {
        char ch;
        int freq;
        Node left, right;

        Node(char c, int f) {
            ch = c;
            freq = f;
        }

        Node(int f, Node l, Node r) {
            freq = f;
            left = l;
            right = r;
        }
    }

    static Node[] dizi = new Node[100];
    static int n = 0;

    static void ekle(Node x) {
        dizi[n] = x;
        n++;
    }

    static Node cikarMin() {
        int mi = 0;
        for (int i = 1; i < n; i++) {
            if (dizi[i].freq < dizi[mi].freq)
                mi = i;
        }
        Node t = dizi[mi];
        dizi[mi] = dizi[n - 1];
        n--;
        return t;
    }

    static void yazKod(Node r, String s) {
        if (r.left == null && r.right == null) {
            System.out.println(r.ch + ": " + s);
            return;
        }
        yazKod(r.left, s + "0");
        yazKod(r.right, s + "1");
    }

    public static void main(String[] args) {

        char[] harf = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] freq = { 5, 9, 12, 13, 16, 45 };

        for (int i = 0; i < harf.length; i++)
            ekle(new Node(harf[i], freq[i]));

        while (n > 1) {
            Node x = cikarMin();
            Node y = cikarMin();
            Node z = new Node(x.freq + y.freq, x, y);
            ekle(z);
        }

        Node kok = dizi[0];
        yazKod(kok, "");
    }
}
