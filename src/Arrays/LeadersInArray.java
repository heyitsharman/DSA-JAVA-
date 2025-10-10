package Arrays;

import java.util.ArrayList;

public class LeadersInArray {
    public static void PrintLeaders(int[] arr){

        for(int i=0; i<arr.length; i++){
            Boolean leader = true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static int[] Optimal(int[] arr){
        int n = arr.length;

       ArrayList<Integer> ans = new ArrayList<>();
       int MaxFromRight = arr[n-1];
       ans.add(MaxFromRight);
       for(int i=n-2; i>=0; i--){
           if(arr[i]>MaxFromRight){
               MaxFromRight=arr[i];
               ans.add(MaxFromRight);
           }
       }

       int[] result = new int[ans.size()];
       for(int i=0; i<ans.size(); i++){
           result[i] = ans.get(i);
       }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};

//        PrintLeaders(arr);

        int[] ans = Optimal(arr);
        for(int x : ans){
            System.out.print(x+" ");
        }
    }

}
