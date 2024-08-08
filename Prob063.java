import java.math.BigInteger;

public class Prob063
{
    public static void main(String[] args)
    {
        int count = 0;
        for(int p = 1; p<30; p++)
        {
            for(int b = 1; b<10; b++)
            {
                BigInteger o = BigInteger.valueOf(b).pow(p);
                if(o.toString().length() == p)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
