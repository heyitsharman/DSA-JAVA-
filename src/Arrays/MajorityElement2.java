package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static List<Integer> Brute(int[] arr){
        List<Integer> l =new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(l.contains(arr[i])) continue;

            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    count ++;
                }
            }
            if(count > arr.length/3){
                l.add(arr[i]);
            }
        }

        return l;
    }
    public static List<Integer> Optimized(int[] arr){
        int cnt1 = 0, cnt2 = 0;
        int el1=0, el2 = 0;
        for(int i=0; i<arr.length; i++){
            if(cnt1==0 && arr[i]!=el2){
                cnt1 = 1;
                el1=arr[i];
            }
            else if(cnt2==0 && arr[i]!=el1){
                cnt2 = 1;
                el2=arr[i];
            }
            else if(el1 == arr[i]){
                cnt1++;
            }
            else if(el2 == arr[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> l = new ArrayList<>();
        cnt1=0;
        cnt2=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==el1) cnt1++;
            if(arr[i]==el2) cnt2++;
        }
        if(cnt1 > arr.length/3) l.add(el1);
        if(cnt2 > arr.length/3) l.add(el2);

        return l;
    }
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<arr.length; i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }


        for(Map.Entry<Integer,Integer> i : map.entrySet()){

            if(i.getValue()> arr.length/3){
                l.add(i.getKey());
            }
        }

        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,2,2,2};
        List<Integer> result = new ArrayList<>();
//        result = Brute(arr);
        result = Optimized(arr);
        for(int x: result ){
            System.out.print(x+" ");
        }


    }
}
