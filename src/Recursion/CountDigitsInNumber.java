package Recursion;

public class CountDigitsInNumber {
    public static int CountDigits(int n){
        if(n==0){
            return 0;
        }
        return 1 + CountDigits(n/10);
    }
    public static void main(String[] args) {
        System.out.print(CountDigits(2567));
    }
}
