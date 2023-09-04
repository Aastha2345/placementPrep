import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxSpecialSum = getMaxSpecialSum(nums);
        System.out.println(maxSpecialSum);
    }

    public static int getMaxSpecialSum(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int maxPartitionSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int j = i - 1; j >= 0; j--) {
                currentSum += nums[j];

                if ((i - j) % 2 == 1) {
                    maxPartitionSum = Math.max(maxPartitionSum, currentSum + dp[j]);
                } else {
                    maxPartitionSum = Math.max(maxPartitionSum, -currentSum + dp[j]);
                }
            }

            dp[i] = maxPartitionSum;
        }

        return dp[n];
    }
}
