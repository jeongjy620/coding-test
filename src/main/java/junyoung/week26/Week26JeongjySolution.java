package junyoung.week26;

public class Week26JeongjySolution {

    public long[] numberInterval(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }

    public int[][] plusRowCol(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;
        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n;

        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (isPossible(citations, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private boolean isPossible(int[] citations, int h) {
        int count = 0;
        for (int citation : citations) {
            if (citation >= h) {
                count++;
            }
        }
        return count >= h;
    }
}
