import java.util.*;

public class Prob047
{
    public static boolean isPrime(int n)
    {
        for(int j = 3; j*j<=n; j+=2)
        {
            if(n % j == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        HashSet<Integer> primes = new HashSet<Integer>();
        primes.add(2);
        for(int i = 3; i<20_000; i+=2)
        {
            if(isPrime(i))
            {
                primes.add(i);
            }
        }
        
        int a = 1;
        int b = 1;
        int c = 1;
        for(int n = 5;; n++)
        {
            HashSet<Integer> factors = new HashSet<Integer>();
            int copy = n;
            for(int p : primes)
            {
                if(primes.contains(copy))
                {
                    factors.add(copy);
                    break;
                }
                if(copy % p == 0)
                {
                    factors.add(p);
                    while(copy % p == 0)
                    {
                        copy /= p;
                    }
                }
                if(copy == 1)
                {
                    break;
                }
            }
            int d = factors.size();
            if(a == 4 && b == 4 && c == 4 && d == 4)
            {
                System.out.println(n-3);
                break;
            }
            a = b;
            b = c;
            c = d;
        }
    }
}
