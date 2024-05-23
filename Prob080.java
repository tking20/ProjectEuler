import java.util.*;
import java.math.*;

public class Prob080
{
    public static void main(String args[])
    {
        HashSet<Integer> squares = new HashSet<Integer>();
        for(int i = 1; i<=10; i++)
        {
            squares.add(i*i);
        }
        
        int sum = 0;
        for(int n = 1; n<=100; n++)
        {
            if(squares.contains(n))
            {
                continue;
            }
            BigDecimal d = new BigDecimal(n).sqrt(new MathContext(102, RoundingMode.HALF_UP));
            String s = d.toString();
            for(int i = 0; i<=100; i++)
            {
                char c = s.charAt(i);
                if(c == '.')
                {
                    continue;
                }
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
