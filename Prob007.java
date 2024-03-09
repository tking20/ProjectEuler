import java.util.Arrays;

public class Prob007
{
	public static void main(String[] args)
	{
		int n = 200_000;
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
		int count = 0;
		for(int i = 0; i<n; i++)
		{
			if(isPrime[i])
			{
				count++;
			}
			if(count == 10_001)
			{
				System.out.println(i);
				break;
			}
		}
	}
}