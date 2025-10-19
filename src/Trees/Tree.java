package Trees;

import java.util.LinkedList;
import java.util.Queue;

// Node class
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Tree class
public class Tree {
    static Node root;

    Tree() {
        root = null;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void LevelOrder(Node root){
        Queue <Node> q = new LinkedList<>();
        if(root==null){
            return;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++){
                Node temp = q.poll();
                System.out.print(temp.data);
                if(i<size-1){
                    System.out.print(" ");
                }
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create tree object
        Tree tree = new Tree();

        // Manually creating nodes
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

//        System.out.println("Tree created with root: " + tree.root.data);
//        preOrder(root);
//        InOrder(root);
//        postOrder(root);

        LevelOrder(root);
        
    }


}
