import java.util.*;
import java.math.BigInteger;

public class Prob087
{
    public static void main(String args[])
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for(int p = 3; p<7_100; p+=2)
        {
            if(BigInteger.valueOf(p).isProbablePrime(1_000))
            {
                primes.add(p);
            }
        }
        
        int q = 50_000_000;
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i<primes.size(); i++)
        {
            int a = primes.get(i);
            a = a*a;
            for(int j = 0; j<primes.size(); j++)
            {
                int b = primes.get(j);
                b = b*b*b;
                if(b > q)
                {
                    break;
                }
                for(int k = 0; k<primes.size(); k++)
                {
                    int c = primes.get(k);
                    c = c*c;
                    c = c*c;
                    if(c > q)
                    {
                        break;
                    }
                    int d = a+b+c;
                    if(d <= q)
                    {
                        set.add(d);
                    }
                }
            }
        }
        System.out.println(set.size());
    }
}
