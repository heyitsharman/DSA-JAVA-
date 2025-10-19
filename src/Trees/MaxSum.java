package Trees;

public class MaxSum {
    private static int maxVal = 0;
    public static int MaxSum(Node root){
        if(root == null){
            return 0;
        }
       int left = Math.max(0,MaxSum(root.left));
        int right = Math.max(0,MaxSum(root.right));
        maxVal = Math.max(maxVal, left + right + root.data);

        return Math.max(left,right) + root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right= new Node(7);

        MaxSum(root);
        System.out.println(maxVal);
    }
}
