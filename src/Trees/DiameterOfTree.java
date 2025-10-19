package Trees;

public class DiameterOfTree {
    private static int maxi = 0;
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int lh = diameter(root.left);
        int rh = diameter(root.right);
        maxi = Math.max(maxi, lh+rh);

        return 1 + Math.max(lh,rh);
    }
    public static int diameterOfBinaryTree(Node root) {
        diameter(root);
        return maxi;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right= new Node(7);

        System.out.println(diameterOfBinaryTree(root));
    }
}
