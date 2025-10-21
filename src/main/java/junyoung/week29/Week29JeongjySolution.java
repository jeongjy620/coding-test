package junyoung.week29;

import java.util.Arrays;

public class Week29JeongjySolution {
    public int budget(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for (int cost : d) {
            if (budget - cost >= 0) {
                budget -= cost;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
