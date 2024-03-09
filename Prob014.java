import java.util.HashMap;

public class Prob014
{
	public static HashMap<Long, Integer> map = new HashMap<Long, Integer>();
	
	public static int collatz(long n)
	{
		if(map.containsKey(n))
		{
			return map.get(n);
		}
		int x = 0;
		if((n & 1) == 0)
		{
			x = 1 + collatz(n>>1);
		}
		else
		{
			x = 2 + collatz((3*n + 1)>>1);
		}
		map.put(n, x);
		return x;
	}
	
	public static void main(String[] args)
	{
		map.put(1L, 1);
		
		int max = 0;
		int ans = 0;
		for(int i = 2; i<1_000_000; i++)
		{
			if(collatz(i) > max)
			{
				max = collatz(i);
				ans = i;
			}
		}
		System.out.println(ans);
	}
}