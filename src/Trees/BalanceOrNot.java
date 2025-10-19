package Trees;

public class BalanceOrNot {

    public static int BalanceOrNot(Node root){
        if(root == null){
            return 0;
        }

        int lh = BalanceOrNot(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = BalanceOrNot(root.left);
        if(rh == -1){
            return -1;
        }
        if(Math.abs(rh-lh)>1){
            return -1;
        }
        return 1 + Math.max(rh,lh);

    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right= new Node(7);
        Boolean balanced = (BalanceOrNot(root) != -1);
        System.out.println(balanced);

    }
}
