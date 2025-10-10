package yujin.week27;

import java.util.Arrays;
import java.util.Comparator;

public class Week27Solution {
    public int[] kThNumber(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] targets = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(targets);
            answer[i] = targets[commands[i][2] - 1];
        }
        return answer;
    }

    public String[] freeSort(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted(Comparator.comparing((String value) -> value.charAt(n)).thenComparing(value -> value))
                .toArray(String[]::new);
    }

    public int[] lottoScore(int[] lottos, int[] winNums) {
        int unknowns = (int) Arrays.stream(lottos)
                .filter(lotto -> lotto == 0)
                .count();

        int corrects = 0;
        for (int lotto : lottos) {
            if (lotto != 0 && Arrays.stream(winNums).anyMatch(value -> value == lotto)) {
                corrects++;
            }
        }

        int maxCorrect = Math.min(6, corrects + unknowns);
        int minScore = Math.min(7 - corrects, 6);
        int maxScore = maxCorrect < 2 ? 6 : 7 - maxCorrect;
        return new int[]{maxScore, minScore};
    }
}