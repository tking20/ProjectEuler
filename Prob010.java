import java.util.Arrays;

public class Prob010
{
	public static void main(String[] args)
	{
		int n = 2_000_000;
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int p = 2; p*p<=n; p++)
		{
			if(isPrime[p])
			{
				for(int i = p*p; i<=n; i+=p)
				{
					isPrime[i] = false;
				}
			}
		}
		long ans = 2;
		for(int i = 3; i<n; i+=2)
		{
			if(isPrime[i])
			{
				ans += i;
			}
		}
		System.out.println(ans);
	}
}