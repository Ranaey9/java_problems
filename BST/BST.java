package BST;

class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST {
    node root;

    public void ekle(int veri) {
        root = ekleRec(root, veri);
    }

    private node ekleRec(node root, int veri) {
        if (root == null) {
            root = new node(veri);
        } else if (veri < root.data) {
            root.left = ekleRec(root, veri);
        } else if (veri > root.data) {
            root.right = ekleRec(root, veri);
        }

        return root;

    }

    public boolean ara(int veri) {
        return araRec(root, veri);
    }

    private boolean araRec(node root, int veri) {
        if (root == null) {
            return false;
        } else if (veri == root.data) {
            return true;
        } else if (veri < root.data) {
            return araRec(root.left, veri);
        } else {
            return araRec(root.right, veri);
        }

    }

    public void sil(int veri) {
        root = silRec(root, veri);
    }

    private node silRec(node root, int veri) {
        if (root == null) {
            return root;
        }
        if (veri < root.data) {
            root.left = silRec(root.left, veri);
        }
        if (veri > root.data) {
            root.right = silRec(root.right, veri);
        } else {
            // çocuk yoksa
            if (root.left == null && root.right == null) {
                return null;
            }
            // tek çocuk
            else if (root.left == null) {
                return root.right;

            } else if (root.right == null) {
                return root.left;

            }
            // iki çocuk
            else {
                int mindeger = mindeger(root.right);
                root.data = mindeger;
                root.right = silRec(root.right, veri);
            }
        }
        return root;
    }

     void guncele(int eski, int yeni) {
        if (ara(eski)) {
            sil(eski);
            ekle(yeni);
            System.out.println("Güncellendi: " + eski + " -> " + yeni);
        } else {
            System.out.println("Güncellenecek değer bulunamadı: " + eski);
        }
    }

    private int mindeger(node root) {
        int minn = root.data;
        while (root.left != null) {
            minn = root.left.data;
            root = root.left;
        }
        return minn;
    }

    public int max() {
        node temp = root;
        while (temp.right != null)
            temp = temp.right;
        return temp.data;
    }

    public int min() {
        node temp = root;
        while (temp.left != null)
            temp = temp.left;
        return temp.data;
    }

}