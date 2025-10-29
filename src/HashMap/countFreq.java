package HashMap;

import java.util.HashMap;

public class countFreq {
    public static void countFreq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]));
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,6};
        countFreq(arr);
    }
}
