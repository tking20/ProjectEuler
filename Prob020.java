import java.math.BigInteger;

public class Prob020
{
	public static void main(String[] args)
	{
		BigInteger o = BigInteger.TWO;
		for(int i = 3; i<=100; i++)
		{
			o = o.multiply(BigInteger.valueOf(i));
		}
		int ans = 0;
		for(char c : o.toString().toCharArray())
		{
			ans += c-48;
		}
		System.out.println(ans);
	}
}