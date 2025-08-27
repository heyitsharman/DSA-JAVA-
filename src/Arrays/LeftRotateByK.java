package Arrays;

public class LeftRotateByK {
    public static void LeftRotate(int[] nums, int k){
        int n = nums.length;
         k = k%n;
//        reserve(nums, 0, k-1);
//        reserve(nums, k, n-1);
//        reserve(nums, 0, n-1);

//            if you want to rotate it right
//        1. reverse whole array
//        2. reverse first k
//        3. reverse last n-k elements\
        reserve(nums, 0, n-1);
        reserve(nums, 0, k-1);
        reserve(nums, k, n-1);


    }
    public static void reserve(int[] arr, int st, int end){
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        LeftRotate(arr,k);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
