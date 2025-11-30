package DP;

public class longestSubsequence {
    public static int solve(String s1 , String s2, int i, int j){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1 + solve(s1,s2,i+1,j+1);
        }
        else{
            int a = solve(s1,s2,i+1,j);
            int b = solve(s1,s2,i,j+1);
            return Math.max(a,b);
        }

    }
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "acef";
        System.out.println(solve(s1,s2,0,0));
    }
}
