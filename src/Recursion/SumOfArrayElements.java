package Recursion;

public class SumOfArrayElements {
    public static int sumOfElements(int[] arr, int i){
        if(i==arr.length){
            return 0;
        }
        return arr[i] + sumOfElements(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,1};
        System.out.println(sumOfElements(arr,0));
    }
}
