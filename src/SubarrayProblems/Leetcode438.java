package SubarrayProblems;

import java.util.ArrayList;
import java.util.*;

public class Leetcode438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length()){
            return res;
        }
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        int k = p.length();
        for(char c : p.toCharArray()){
            pCount[c-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            sCount[s.charAt(i)-'a']++;

            if(i>=k){
                sCount[s.charAt(i-k)-'a']--;
            }

            if(Arrays.equals(pCount,sCount)){
                res.add(i-k+1);
            }
        }
        return res;
    }
}
