package HashMap;

import java.util.HashMap;

public class jewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : jewels.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = 0;
        for(char c : stones.toCharArray()){
            if(map.containsKey(c)){
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z","Zz"));
    }
}
