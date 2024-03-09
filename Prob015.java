import java.math.BigInteger;

public class Prob015
{
	public static void main(String[] args)
	{
		BigInteger[] fac = new BigInteger[41];
		fac[0] = BigInteger.ONE;
		for(int i = 1; i<fac.length; i++)
		{
			fac[i] = fac[i-1].multiply(BigInteger.valueOf(i));
		}
		System.out.println(fac[40].divide(fac[20]).divide(fac[20]));
	}
}