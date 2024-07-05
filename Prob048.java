import java.math.BigInteger;

public class Prob048
{
    public static void main(String args[])
    {
        BigInteger o = BigInteger.ZERO;
        for(int n = 1; n<=1000; n++)
        {
            o = o.add(BigInteger.valueOf(n).pow(n));
        }
        System.out.println(o.mod(BigInteger.TEN.pow(10)));
    }
}