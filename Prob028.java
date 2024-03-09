public class Prob028
{
	public static void main(String[] args)
	{
		int sum = 1;
		for(int i = 2; i<=1001/2+1; i++)
		{
			sum += 4*i*i - 10*i + 7;
			sum += 4*i*i - 4*i + 1;
			sum += 4*i*i - 8*i + 5;
			sum += 4*i*i - 6*i + 3;
		}
		System.out.println(sum);
	}
}