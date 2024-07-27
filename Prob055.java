import java.math.BigInteger;

public class Prob055
{
    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 1; i<10_000; i++)
        {
            int j = 0;
            BigInteger o = BigInteger.valueOf(i);
            for(; j<50; j++)
            {
                String s = o.toString();
                StringBuilder sb = new StringBuilder(s);
                o = o.add(new BigInteger(sb.reverse().toString()));
                sb = new StringBuilder(o.toString());
                if(sb.reverse().toString().equals(o.toString()))
                {
                    break;
                }
            }
            if(j == 50)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
