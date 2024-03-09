import java.util.HashMap;

public class Prob021
{
	public static int pow(int a, int b)
	{
		if(b == 0)
		{
			return 1;
		}
		if(b == 1)
		{
			return a;
		}
		int x = pow(a, b>>1);
		x = x*x;
		if((b & 1) == 1)
		{
			return x*a;
		}
		return x;
	}
	
	public static void main(String[] args)
	{
		int[] nums = new int[10_000];
		for(int i = 2; i<10_000; i++)
		{
			HashMap<Integer, Integer> pf = new HashMap<Integer, Integer>();
			int copy = i;
			while((copy & 1) == 0)
			{
				pf.put(2, 1 + pf.getOrDefault(2, 0));
				copy>>=1;
			}
			for(int j = 3; j*j<=copy; j++)
			{
				while(copy % j == 0)
				{
					pf.put(j, 1 + pf.getOrDefault(j, 0));
					copy = copy/j;
				}
			}
			if(copy > 1)
			{
				pf.put(copy, 1);
			}
			int sum = 1;
			for(int div : pf.keySet())
			{
				sum *= (pow(div, pf.get(div)+1) - 1)/(div-1);
			}
			nums[i] = sum-i;
		}
		
		int ans = 0;
		for(int i = 2; i<10_000; i++)
		{
			int x = nums[i];
			if(x != i && x < 10_000 && nums[x] == i)
			{
				ans += x + i;
			}
		}
		System.out.println(ans/2);
	}
}