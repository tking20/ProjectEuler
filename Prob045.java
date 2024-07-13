import java.util.HashSet;

public class Prob045
{
	public static void main(String[] args)
	{
		HashSet<Long> set = new HashSet<Long>();
		for(long n = 286;; n++)
		{
			set.add(n*(3*n - 1)/2);
			if((n & 1) == 1 && set.contains(n*(n+1)/2))
			{
				System.out.println(n*(n+1)/2);
				break;
			}
		}
	}
}