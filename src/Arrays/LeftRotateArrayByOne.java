package Arrays;

public class LeftRotateArrayByOne {
    public static void leftRotate(int[] arr){
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        leftRotate(arr);

        for(int x : arr){
            System.out.println(x+" ");
        }
    }
}
