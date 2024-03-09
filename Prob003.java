public class Prob003
{
	public static void main(String[] args)
	{
		long l = 600_851_475_143L;
		for(int i = 3; i*i<=l; i+=2)
		{
			while(l % i == 0)
			{
				l = l/i;
			}
		}
		System.out.println(l);
	}
}