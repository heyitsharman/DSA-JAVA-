package Trees;

import java.util.*;

public class ZigZagTraversal {
    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean l2r = true;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> row = new ArrayList<>(Collections.nCopies(n,0));

            for(int i=0; i<n; i++){
                Node front = q.poll();

                int index = l2r ? i : (n-i-1);
                row.set(index ,front.data);
                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
            ans.add(row);
            l2r = !l2r;
        }

        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Calling zigzagLevelOrder traversal

        List<List<Integer>> result = zigzagLevelOrder(root);

        // Printing the result
        System.out.println("Zigzag Level Order Traversal:");
        for(List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
