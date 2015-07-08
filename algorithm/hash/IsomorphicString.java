import java.util.Map;
import java.util.HashMap;

public class IsmorphocString {

    // assume the lengths of both string are same.
    public boolean isIsomorphic(String s, String t) {
        
        // Defensive case
        if (s == null || t == null) return false;
        if (s.equals("") && t.equals("")) return true;
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        int n = s.length();
        for (int i = 0; i < n; i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
	    // tracking the position of last apperance
            if (map1.containsKey(cs) && map2.containsKey(ct)){
                if (map1.get(cs) != map2.get(ct)){
                    return false;
                }else{
                    continue;
                }
            }
            if (map1.containsKey(cs)){
                return false;
            }
            if (map2.containsKey(ct)){
                return false;
            }
            map1.put(cs, i);
            map2.put(ct, i);
        }
        return true;
    }
}
