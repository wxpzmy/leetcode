public class RotateArray {

    // rotate an array of n elements to the right by k steps
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 1){
            return;
        }
        // truncate k
        k %= n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }
    private void reverse(int[] nums, int start, int end){
        int tmp = 0;
        while (start < end){
            tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }
}
