package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int x : nums1){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                arr.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] ans = new int[arr.size()];
        int index=0;
        for(int x: arr){
            ans[index++]=x;
        }
        return ans;
    }
}
