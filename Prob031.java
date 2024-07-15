public class Prob031
{
    public static void main(String args[])
    {
        int q = 200;
        int[] dp = new int[q+1];
        dp[0] = 1;
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
        for(int j = 0; j<coins.length; j++)
        {
            for(int i = coins[j]; i<=q; i++)
            {
                dp[i] += dp[i - coins[j]];
            }
        }
        System.out.println(dp[q]);
    }
}
