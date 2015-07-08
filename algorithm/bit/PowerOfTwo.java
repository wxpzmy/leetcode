public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        // check the boundary case
        if(n == 0) return false;
        
        while (n % 2 == 0){
            n >>= 1;
        }
        
	// the last number should stop at 1 if true
        return n == 1; 
    }
}
