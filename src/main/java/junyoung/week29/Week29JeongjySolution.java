package junyoung.week29;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public int[] pickTwoAndSum(int[] numbers) {
        Set<Integer> sumNumbers = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                sumNumbers.add(numbers[i] + numbers[j]);
            }
        }
        return sumNumbers.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
