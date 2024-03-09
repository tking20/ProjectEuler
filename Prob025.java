import java.math.BigInteger;

public class Prob025
{
	public static BigInteger[][] o = new BigInteger[2][2];
	
	public static BigInteger[][] mul(BigInteger[][] a, BigInteger[][] b)
	{
		BigInteger[][] ans = new BigInteger[2][2];
		ans[0][0] = a[0][0].multiply(b[0][0]).add(a[0][1].multiply(b[1][0]));
		ans[0][1] = a[0][0].multiply(b[0][1]).add(a[0][1].multiply(b[1][1]));
		ans[1][0] = a[1][0].multiply(b[0][0]).add(a[1][1].multiply(b[1][0]));
		ans[1][1] = a[1][0].multiply(b[0][1]).add(a[1][1].multiply(b[1][1]));
		return ans;
	}
	
	public static BigInteger[][] pow(BigInteger[][] o, int p)
	{
		if(p == 1)
		{
			return o;
		}
		BigInteger[][] t = pow(o, p>>1);
		t = mul(t, t);
		if((p & 1) == 1)
		{
			return mul(t, o);
		}
		return t;
	}
	
	public static BigInteger fib(int n)
	{
		return pow(o, n)[1][0];
	}
	
	public static void main(String[] args)
	{
		o[0][0] = BigInteger.ZERO;
		o[0][1] = BigInteger.ONE;
		o[1][0] = BigInteger.ONE;
		o[1][1] = BigInteger.ONE;
		
		int min = 1;
		int max = 10_000;
		int mid = (min+max)/2;
		while(max > min)
		{
			if(fib(mid).toString().length() < 1000)
			{
				min = mid+1;
			}
			else
			{
				max = mid;
			}
			mid = (min+max)/2;
		}
		System.out.println(mid);
	}
}