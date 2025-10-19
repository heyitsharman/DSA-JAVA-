package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static Trees.Tree.root;

//public class Tree{
//    static Node root;
//    Tree(){
//        root = null;
//    }
//}


public class IterativeTraversal {
    public static List<Integer> preorder(Node root){
        Stack<Node> st = new Stack<>();
        List <Integer> preorder = new ArrayList<>();
        if(root == null){
            return preorder;
        }
        st.push(root);
        while(!st.empty()){
            root = st.pop();
            preorder.add(root.data);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!= null){
                st.push(root.left);
            }

        }
        return preorder;
    }
    public static List<Integer> inorder(Node root){
        Stack <Node> st = new Stack<>();
        List<Integer> l = new ArrayList<>();
        Node temp = root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp =temp.left;
            }
            else{
                if(st.empty()){
                    break;
                }
                temp = st.pop();
                l.add(temp.data);
                temp = temp.right;

            }
        }
        return l;
    }
    public static List<Integer> postorder(Node root){
        List <Integer> l = new ArrayList<>();
        Stack <Node> st1 = new Stack();
        Stack <Node> st2 = new Stack();
        if(root==null){
            return l;
        }
        st1.push(root);
        while(!st1.empty()){
            root = st1.pop();
            st2.push(root);
            if(root.left != null){
                st1.push(root.left);
            }
            if(root.right != null){
                st1.push(root.right);
            }
        }
        while(!st2.empty()){
            l.add(st2.pop().data);
        }

        return l;
    }

    public static int maxDepth(Node root){
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return 1+ Math.max(l,r);
    }
    public static void main(String[] args) {
        Tree tree= new Tree();
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);


        List<Integer> result = new ArrayList<>();
//        result  = preorder(root);
//        result = inorder(root);
        result = postorder(root);
//        for(int x: result){
//            System.out.print(x+" ");
//        }

//        Height of a binary Tree
        System.out.println(maxDepth(root));

    }
}
