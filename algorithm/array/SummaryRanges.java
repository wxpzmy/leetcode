import java.util.List;
import java.util.ArrayList;

public class SummaryRanges{
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list= new ArrayList<>();
        int len = nums.length;
        if(len == 1){
            list.add(nums[0]+"");
            return list;
        }
        
        int start = 0;
        for(int i = 0; i < len; i++){
            start = nums[i];
            
            // find the end of range
            while( i+1 < nums.length && 
                (nums[i+1]-nums[i])==1 ){
                i++;
            }
            
            // check the single case
            if( start !=nums[i]){
                list.add(start+"->"+nums[i]);
            }else{
                list.add(start+"");
            }
        }
        
        return list;
    }
}
