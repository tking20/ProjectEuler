public class Prob002
{
	public static void main(String[] args)
	{
		int sum = 0;
		int a = 1;
		int b = 1;
		while(b < 4_000_000)
		{
			int c = a+b;
			a = b;
			b = c;
			if(b % 2 == 0)
			{
				sum += b;
			}
		}
		System.out.println(sum);
	}
}