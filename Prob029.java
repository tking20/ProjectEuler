import java.math.BigInteger;
import java.util.HashSet;

public class Prob029
{
	public static void main(String[] args)
	{
		HashSet<BigInteger> set = new HashSet<BigInteger>();
		for(int a = 2; a<=100; a++)
		{
			BigInteger o = BigInteger.valueOf(a);
			for(int b = 2; b<=100; b++)
			{
				o = o.multiply(BigInteger.valueOf(a));
				set.add(o);
			}
		}
		System.out.println(set.size());
	}
}