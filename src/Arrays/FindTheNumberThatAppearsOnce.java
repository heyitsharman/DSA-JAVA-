package Arrays;

public class FindTheNumberThatAppearsOnce {
    public static int AppearsOnce(int[] arr){
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result ^= arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5};
        int res = AppearsOnce(arr);
        System.out.println(res);
    }
}
