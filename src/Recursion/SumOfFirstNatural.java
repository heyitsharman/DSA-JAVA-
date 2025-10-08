package Recursion;

public class SumOfFirstNatural {
    public static int SumOfNumbers(int n){
        if(n==0){
            return 0;
        }
        return n + SumOfNumbers(n-1);
    }
    public static void main(String[] args) {
        System.out.println(SumOfNumbers(5));
    }
}
