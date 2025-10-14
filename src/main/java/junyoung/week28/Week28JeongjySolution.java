package junyoung.week28;

public class Week28JeongjySolution {
    public int expressionOfNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            int sum = 0;
            for (int j = i; j <= n / 2 + 1; j++) {
                sum += j;
                if (sum == n) {
                    count++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return count + 1;
    }
}
