public class Prob006
{
	public static void main(String[] args)
	{
		int a = 0;
		for(int i = 1; i<=100; i++)
		{
			a += i*i;
		}
		a -= (100*101/2)*(100*101/2);
		System.out.println(-a);
	}
}