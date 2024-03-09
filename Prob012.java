import java.util.HashMap;

public class Prob012
{
	public static void main(String[] args)
	{
		int n = 1;
		for(int i = 2; i<20_000; i++)
		{
			n = n+i;
			int copy = n;
			HashMap<Integer, Integer> pf = new HashMap<Integer, Integer>();
			while(copy % 2 == 0)
			{
				pf.put(2, 1 + pf.getOrDefault(2, 0));
				copy>>=1;
			}
			for(int j = 3; copy>1; j+=2)
			{
				while(copy % j == 0)
				{
					pf.put(j, 1 + pf.getOrDefault(j, 0));
					copy/=j;
				}
			}
			int x = 1;
			for(int y : pf.values())
			{
				x *= y+1;
			}
			if(x > 500)
			{
				System.out.println(n);
				break;
			}
		}
	}
}