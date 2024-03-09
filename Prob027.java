import java.util.Arrays;

public class Prob027
{
	public static void main(String[] args)
	{
		int len = 1_000_000;
		boolean[] isPrime = new boolean[len+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int p = 2; p*p<=len; p++)
		{
			if(isPrime[p])
			{
				for(int i = p*p; i<=len; i+=p)
				{
					isPrime[i] = false;
				}
			}
		}
		
		int max = 0;
		int ans = 0;
		for(int b = 2; b<=1000; b++)
		{
			if(!isPrime[b])
			{
				continue;
			}
			for(int a = -999; a<1000; a++)
			{
				int n = 0;
				for(;; n++)
				{
					int x = n*n + a*n + b;
					if(x < 0 || !isPrime[x])
					{
						break;
					}
				}
				if(max < n)
				{
					max = n;
					ans = a*b;
				}
			}
		}
		System.out.println(ans);
	}
}