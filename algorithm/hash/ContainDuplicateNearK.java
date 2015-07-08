import java.util.Set;
import java.util.HashSet;

// Time is O(n)
public class ContainDuplicateNearK{

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<>();

        // window slicing
        for (int i = 0; i < nums.length; i++){
            if (i-k > 0){
                set.remove(nums[i-k-1]);
            }
            if (set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
