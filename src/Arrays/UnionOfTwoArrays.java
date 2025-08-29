package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,5};
        int arr2[] = {2,3,4,4,5,6};

////        brute force
//        ArrayList<Integer> arr = new ArrayList<>();
//        Set<Integer> st = new LinkedHashSet<>();
//
//        for(int i=0; i<arr1.length; i++){
//            st.add(arr1[i]);
//        }
//        for(int i=0; i<arr2.length; i++){
//            st.add(arr2[i]);
//        }
//
//        int[] union = new int[st.size()];
//        int index=0;
//        for(int x : st){
//            union[index++] = x;
//        }
//
//        for(int i=0; i<union.length; i++){
//            System.out.print(union[i]+" ");
//        }

//        optimal approach
        int j=0;
        int i=0;
        ArrayList<Integer> union = new ArrayList<>();
        int elementToAdd;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){

                elementToAdd = arr1[i];
                i++;
            }
            else{
                elementToAdd= arr2[j];
                j++;
            }
            if (union.isEmpty() || union.get(union.size() - 1) != elementToAdd) {
                union.add(elementToAdd);
            }

        }
        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        for(int x : union){
            System.out.print(x+" ");
        }
        
    }
}
