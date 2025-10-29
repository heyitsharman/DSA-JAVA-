package Backtracking;

public class mergeSort {
    public static void partition(int[] arr, int low , int mid, int high){
        int left = low;
        int right = mid +1;
        int[] temp = new int[high-low+1];
        int index=0;
        while(left<=mid && right<=high){

            if(arr[left]<=arr[right]){
                temp[index++] = arr[left];
                left++;
            }
            else{
                temp[index++] = arr[right];
                right++;
            }
        }
        while(left<=mid){
            temp[index++]=arr[left];
            left++;
        }
        while(right<=high){
            temp[index++]=arr[right];
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp[i-low];
        }
    }
    public static void merge(int[] arr,int low , int high){
        if(low>=high) return ;
            int mid = (low+high)/2;
            merge(arr,low,mid);
            merge(arr,mid+1,high);
            partition(arr,low,mid,high);

    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,3,4,1,6,4};
        merge(arr,0,arr.length-1);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }

}
