
import java.util.Arrays;

// Running time is O(1)
public class RectangleArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

        // X : A, E, C, G
        // Y : F, B, H, D

        int area1 = (C-A)*(D-B);
        int area2 = (G-E)*(H-F);
        int sum = area1 + area2;
     
        // no intersection case
        if (A >= G || C <= E || D <= F || B>= H) 
            return sum;
        
        // find the intersection
        int[] buffer = new int[]{A, E, C, G};
        Arrays.sort(buffer);
        int len = buffer[2] - buffer[1];
        buffer = new int[]{F, B, H, D};
        Arrays.sort(buffer);
        int wid = buffer[2] - buffer[1];
        return sum - len*wid;
    }
}


