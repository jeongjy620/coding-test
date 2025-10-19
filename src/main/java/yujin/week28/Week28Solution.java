package yujin.week28;

public class Week28Solution {
    public String year2016(int a, int b) {
        int[] monthDays = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int days = 0;
        for (int i = 0; i < a - 1; i++) {
            days += monthDays[i];
        }
        days += b;
        return dayOfWeek[days % 7];
    }

    public int makeDecimal(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isDecimal(nums[i] + nums[j] + nums[k])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private boolean isDecimal(int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int findDecimal(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isDecimal(i)) {
                count++;
            }
        }
        return count;
    }
}
