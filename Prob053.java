import java.math.BigInteger;

public class Prob053
{
    public static void main(String args[])
    {
        BigInteger[] fac = new BigInteger[101];
        fac[0] = BigInteger.ONE;
        for(int i = 1; i<fac.length; i++)
        {
            fac[i] = fac[i-1].multiply(BigInteger.valueOf(i));
        }
        int count = 0;
        for(int n = 1; n<=100; n++)
        {
            for(int r = 0; r<=n; r++)
            {
                if(fac[n].divide(fac[r]).divide(fac[n-r]).compareTo(BigInteger.TEN.pow(6)) > 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
