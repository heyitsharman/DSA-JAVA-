package Recursion;

public class PowerOfNumber {
    public static int PowerOfNumber(int a, int b){
        if(b==0){
            return 1;
        }
        return a * PowerOfNumber(a,b-1);
    }
    public static void main(String[] args) {
        System.out.print(PowerOfNumber(5,2));
    }
}
