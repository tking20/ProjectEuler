import java.math.BigInteger;

public class Prob016
{
	public static void main(String[] args)
	{
		BigInteger o = BigInteger.ONE.shiftLeft(1000);
		int ans = 0;
		for(char c : o.toString().toCharArray())
		{
			ans += c-48;
		}
		System.out.println(ans);
	}
}