package Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascal2 {
    public static List<Integer> getRow(int rowIndex) {
        List <Integer> l = new ArrayList<>();
        long ans = 1;
        int n = rowIndex + 1;
        l.add(1);
        for(int i=1; i<n; i++){
            ans *= (n-i);
            ans /= i;
            l.add((int)ans);
        }
        return l;
    }

    public static void main(String[] args) {
        List <Integer> res = new ArrayList<>();
        res = getRow(2);
        for(int x: res){
            System.out.print(x+" ");
        }
    }
}
