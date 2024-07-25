import java.math.BigInteger;

public class Prob056
{
    public static void main(String[] args)
    {
        int max = 0;
        for(int a = 1; a<100; a++)
        {
            for(int b = 1; b<100; b++)
            {
                BigInteger o = BigInteger.valueOf(a).pow(b);
                int sum = 0;
                for(char c : o.toString().toCharArray())
                {
                    sum += c-'0';
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
