import java.math.BigInteger;

public class Prob097
{
    public static void main(String[] args)
    {
        System.out.println(BigInteger.TWO.pow(7830457).multiply(BigInteger.valueOf(28433)).add(BigInteger.ONE).mod(BigInteger.TEN.pow(10)));
    }
}
