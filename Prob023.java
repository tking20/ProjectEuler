import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Prob023
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
		ArrayList<Integer> abundant = new ArrayList<Integer>();
		for(int i = 12; i<28123; i++)
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
			sum -= i;
			if(sum > i)
			{
				abundant.add(i);
			}
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<abundant.size(); i++)
		{
			for(int j = i; j<abundant.size(); j++)
			{
				int z = abundant.get(i) + abundant.get(j);
				if(z <= 28123)
				{
					set.add(z);
				}
			}
		}
		int ans = 0;
		for(int i = 0; i<28123; i++)
		{
			if(!set.contains(i))
			{
				ans += i;
			}
		}
		System.out.println(ans);
	}
}