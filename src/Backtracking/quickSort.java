package Backtracking;

import static Arrays.LeetcodeProblem283.swap;

public class quickSort {
    public static int partition(int[] arr, int low,int high){
        int i=low;
        int j = high;
        int pivot = arr[low];
        while(i<j){
            while(arr[i] <= pivot && i<high){
                i++;
            }
            while(arr[j] >= pivot && j>low){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j+1;
    }
    public static void quickSort(int[]arr, int low,int high){
        if(low<high){
            int pIndex = partition(arr,low,high);
            quickSort(arr,low, pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,3,4,1,6,4};
        quickSort(arr,0,arr.length-1);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
