public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int i = 0;
        while (i < 32){
            result = (n & 1) + result * 2;
	    // unsign >>
            n = n >>> 1;
            i++;
        }
        return result;
    }
}
