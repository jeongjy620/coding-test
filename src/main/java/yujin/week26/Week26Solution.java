package yujin.week26;

public class Week26Solution {
    public int[] convertBinary(String s) {
        int convertCount = 0;
        int totalRemoveZeroCount = 0;
        while (!s.equals("1")) {
            convertCount++;
            totalRemoveZeroCount += s.length() - s.replaceAll("0", "").length();
            s = Integer.toString(s.replaceAll("0", "").length(), 2);
        }
        return new int[]{convertCount, totalRemoveZeroCount};
    }

    public int fibonacciSeries(int n) {
        int f1 = 0;
        int f2 = 1;
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            answer = (f1 + f2) % 1234567;
            f1 = f2;
            f2 = answer;
        }
        return answer;
    }
}
