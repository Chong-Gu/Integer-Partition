
public class Integer_partition {
	public static void main(String[] args) {
		System.out.print(computePartitions(5));
	}
	
	private static int computePartitions(int n) {
		int[][] dp = new int[n+1][n+1];
		dp[0][0] = 1;
		
		for (int i = 1; i <= n; i++)
			dp[0][i] = 0;
		
		for (int row = 1; row <= n; row++) {
			for (int col = 0; col <= n; col++) {
				if (col - row < 0)
					dp[row][col] = dp[row - 1][col];
				else
					dp[row][col] = dp[row - 1][col] + dp[row][col - row];
			}
		}
		
		return dp[n][n];
	}
}
