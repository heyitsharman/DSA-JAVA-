package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();
        map.put(1,"Harman");
        map.put(2,"Priyal");
        map.put(3,"arya");

//        System.out.println(map);
//        System.out.println(map.get(3));
//        System.out.println(map.containsKey(4));
//        System.out.println(map.containsValue("Priyal"));

//         looping through map (prints values)
//        Set<Integer> keys = map.keySet();
        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }

        Set <Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
//            System.out.println(entry.getKey()+": "+entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey()+": "+entry.getValue());
        }



    }
}
