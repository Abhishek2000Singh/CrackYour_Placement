import java.util.ArrayList;
import java.util.Collections;

public class Pq3_ChocolateDistribution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (m > n) {
            return -1;
        }

        Collections.sort(a);

        long minDiff = Long.MAX_VALUE;

        for (int i = 0; i <= n - m; i++) {
            int currentDiff = a.get(i + m - 1) - a.get(i);
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {

    }
}
