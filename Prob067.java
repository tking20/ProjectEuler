import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob067
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int q = 100;
		int[][] nums = new int[q][1];
		Scanner read = new Scanner(new File("triangle.txt"));
		for(int i = 0; i<q; i++)
		{
			nums[i] = new int[i+1];
			for(int j = 0; j<=i; j++)
			{
				nums[i][j] = read.nextInt();
			}
		}
		
		int[][] dp = new int[q][1];
		dp[0][0] = nums[0][0];
		for(int i = 1; i<q; i++)
		{
			dp[i] = new int[i+1];
			dp[i][0] = dp[i-1][0] + nums[i][0];
			dp[i][i] = dp[i-1][i-1] + nums[i][i];
			for(int j = 1; j<i; j++)
			{
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + nums[i][j];
			}
		}
		int ans = 0;
		for(int x : dp[q-1])
		{
			ans = Math.max(ans, x);
		}
		System.out.println(ans);
	}
}