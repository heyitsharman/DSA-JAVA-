package Arrays;
import java.util.*;
public class LongestConsecutiveSequence {
    public static int Brute(int[] arr){
        int count = 1;
        int longest=1;
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]+1){
                count++;
            }
            else{
                count=1;
            }
            longest = Math.max(longest,count);
        }
        return longest ;
    }

    public static int Optimized(int[] arr){
        HashSet<Integer> st = new HashSet<>();
        for(int x : arr){
            st.add(x);
        }
        int longest = 1;
        for(int num : st){
            if(!st.contains(num-1)) {
                int currNumber = num;
                int count = 1;

                while(st.contains(currNumber+1)){
                    count ++;
                    currNumber++;
                }
                longest = Math.max(count,longest);
            }

        }

        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
//        System.out.println(Brute(arr));
        System.out.println(Optimized(arr));
    }

}
