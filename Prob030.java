public class Prob030
{
	public static void main(String[] args)
	{
		int ans = 0;
		for(int i = 10; i<1_000_000; i++)
		{
			int sum = 0;
			for(char c : (""+i).toCharArray())
			{
				sum += Math.round(Math.pow(c-48, 5));
			}
			if(sum == i)
			{
				ans += sum;
			}
		}
		System.out.println(ans);
	}
}