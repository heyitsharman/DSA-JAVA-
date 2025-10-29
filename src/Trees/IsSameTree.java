package Trees;

public class IsSameTree {
    public static boolean isSame(Node p, Node q){
        if(p==null || q==null){
            return p==q;
        }
        return (p.data == q.data) && isSame(p.left,q.left) && isSame(p.right,q.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(9);

        System.out.println(isSame(root1,root2));

    }
}
