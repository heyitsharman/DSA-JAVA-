package Arrays;

import static Arrays.LeetcodeProblem283.swap;

public class SortColors {
    public static void Brute(int[]arr){
        int cnt1 =0;
        int cnt2 = 0;
        int cnt3 = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==0){
                cnt1++;
            }
            else if(arr[i]==1){
                cnt2++;
            }
            else{
                cnt3++;
            }
        }
        int index = 0;
        while(cnt1>0){
            arr[index++]=0;
            cnt1--;
        }
        while(cnt2>0){
            arr[index++]=1;
            cnt2--;
        }
        while(cnt3>0){
            arr[index++] = 2;
            cnt3--;
        }
    }
    public static void DutchNationalFlagAlgorithm(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};
        Brute(arr);
        DutchNationalFlagAlgorithm(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
