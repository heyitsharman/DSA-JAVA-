
package Trees;
import java.util.Scanner;

public class Tree {
    Scanner sc = new Scanner(System.in);
    private Node root;

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node() {

        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public void createTree() {
        this.root = createTree(root);
    }

    private Node createTree(Node root) {
        int val = sc.nextInt();
        Node nn = new Node();
        nn.data = val;

        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree(nn);
        }

        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree(nn);
        }
        return nn;
    }

    public void preorder() {
        preorder(this.root);
    }

    private void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public void maxNode(Node root){
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Node current = root;
        while (current.right != null) {
            current = current.right;
        }

        System.out.println("Maximum node value: " + current.data);
    }
    public static void main(String[] args) {
        Tree tt = new Tree();
        tt.createTree();
        tt.preorder();


    }
}