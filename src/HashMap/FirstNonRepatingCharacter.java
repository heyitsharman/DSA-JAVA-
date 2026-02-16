package HashMap;
import java.util.*;
public class FirstNonRepatingCharacter {
    public static int firstUniqueChar(String str) {
        // Write your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans = -1;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.get(ch)==1){
                ans = i;
                break;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        str = sc.next();
        System.out.println(firstUniqueChar(str));
    }
}
