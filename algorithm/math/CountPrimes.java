import java.util.Map;
import java.util.HashSet;

//Sieve of Eratosthenis
public class CountPrimes {
    public int countPrimes(int n) {
        
        boolean[] flag = new boolean[n];

	//  square strick for Eratosthenix
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(!flag[i-1]){
		// the number smaller than i * i already checked
                for (int j = i*i; j < n; j += i)
                    flag[j-1] = true;
            }
        }
        
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!flag[i-1]){
                count++;
            }
        }
        return count;
    }
}
