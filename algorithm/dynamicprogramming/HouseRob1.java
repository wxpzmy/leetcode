public class HouseRob {
    // dynamic programming:
    // cul[i] = max(cul[i-1], nums[i]+cul[i-2])
    // The only thing need to memorize is cul[i-1], cul[i-2]
    public int rob(int[] nums){
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int preOne = Math.max(nums[1], nums[0]);
        int preTwo = nums[0];
        int max = preOne;
        for(int i = 2; i < nums.length; i++){
            max = Math.max(preOne, nums[i] + preTwo);
            preTwo = preOne;
            preOne = max;
        }
        return max;
    }
}
