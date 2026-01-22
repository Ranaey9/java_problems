package Heap;

public class Heap {

    int[] h = new int[1000];
    int size = 0;

    void swap(int i, int j) {
        int t = h[i];
        h[i] = h[j];
        h[j] = t;
    }

    void up(int i) {
        while (i > 1 && h[i] > h[i / 2]) {
            swap(i, i / 2);
            i = i / 2;
        }
    }

    void down(int i) {
        while (true) {
            int l = i * 2;
            int r = l + 1;
            int b = i;

            if (l <= size && h[l] > h[b])
                b = l;
            if (r <= size && h[r] > h[b])
                b = r;

            if (b == i)
                break;

            swap(i, b);
            i = b;
        }
    }

    void push(int x) {
        size++;
        h[size] = x;
        up(size);
    }

    int pop() {
        if (size == 0)
            return -1;
        int mx = h[1];
        h[1] = h[size];
        size--;
        down(1);
        return mx;
    }

    void print() {
        for (int i = 1; i <= size; i++)
            System.out.print(h[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.push(10);
        hp.push(40);
        hp.push(5);
        hp.push(70);
        hp.push(30);

        hp.print();

        System.out.println(hp.pop());
        hp.print();

        System.out.println(hp.pop());
        hp.print();
    }
}
