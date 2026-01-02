package Avl;

class node {
    int data;
    node left, right;
    int height;

    node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}

public class AVL {
    node root;

    int height(node n) {
        if (n == null)
            return 0;
        return n.height;
    }

    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    node rigtnode(node y) {
        node x = y.left;
        node t = x.right;

        x.right = y;
        y.left = t;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    node leftnode(node x) {
        node y = x.right;
        node t = y.left;

        y.left = x;
        x.right = t;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int denge(node n) {
        if (n == null)
            return 0;
        return height(n.left) - height(n.right);
    }

    node insert(node n, int key) {
        if (n == null)
            return new node(key);

        if (key < n.data)
            n.left = insert(n.left, key);
        else if (key > n.data)
            n.right = insert(n.right, key);
        else
            return n;

        n.height = 1 + max(height(n.left), height(n.right));

        int d = denge(n);
        // sol taraf ağır olduğunda (LL)
        if (d > 1 && key < n.left.data)
            return rigtnode(n);
        // sağ taraf ağır olduğunda (RR)
        if (d < -1 && key > n.right.data)
            return leftnode(n);
        // sol taraf ağır olduğunda (LR)
        if (d > 1 && key > n.left.data) {
            n.left = leftnode(n.left);
            return rigtnode(n);
        }
        // sağ taraf ağır oldugunda (RL)
        if (d < -1 && key < n.right.data) {
            n.right = rigtnode(n.right);
            return leftnode(n);
        }

        return n;
    }

    void inorder(node n) {
        if (n != null) {
            inorder(n.left);
            System.out.print(n.data + " ");
            inorder(n.right);
        }
    }

    public static void main(String[] args) {
        AVL agac = new AVL();
        int[] sayilar = { 10, 20, 30, 40, 50, 25 };

        for (int s : sayilar)
            agac.root = agac.insert(agac.root, s);

        System.out.println("AVL Ağacı Inorder:");
        agac.inorder(agac.root);
    }
}
