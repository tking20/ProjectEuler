public class Prob005
{
	public static int gcd(int a, int b)
	{
		if(a % b == 0)
		{
			return b;
		}
		return gcd(b, a%b);
	}
	
	public static void main(String[] args)
	{
		int ans = 1;
		for(int i = 2; i<=20; i++)
		{
			int g = gcd(ans, i);
			ans = ans/g*i;
		}
		System.out.println(ans);
	}
}