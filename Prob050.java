import java.util.*;

public class Prob050
{
    public static boolean isPrime(int n)
    {
        if(n < 4)
        {
            return n > 1;
        }
        if((n & 1) == 0)
        {
            return false;
        }
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
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for(int j = 3; j<5_000; j+=2)
        {
            if(isPrime(j))
            {
                primes.add(j);
            }
        }
        int max = 0;
        int ans = 0;
        int n = primes.size();
        for(int i = 0; i<n; i++)
        {
            int sum = 0;
            for(int j = i; j<n; j++)
            {
                sum += primes.get(j);
                if(sum >= 1_000_000)
                {
                    break;
                }
                if(isPrime(sum))
                {
                    if(max < j-i)
                    {
                        max = j-i;
                        ans = sum;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
