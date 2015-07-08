import java.util.Set;
import java.util.HashSet;


public class ContainDuplicate{

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int each = nums[i];
            if(hashset.contains(each)){
                return true;
            }else{
                hashset.add(each);
            }
        }
        return false;
    }
}
