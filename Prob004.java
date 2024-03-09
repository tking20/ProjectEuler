public class Prob004
{
	public static void main(String[] args)
	{
		int best = 0;
		for(int a = 100; a<1000; a++)
		{
			for(int b = a; b<1000; b++)
			{
				int c = a*b;
				String s = ""+c;
				if(new StringBuilder(s).reverse().toString().equals(s))
				{
					best = Math.max(best, c);
				}
			}
		}
		System.out.println(best);
	}
}