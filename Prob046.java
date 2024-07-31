import java.util.*;

public class Prob046
{
    public static void main(String[] args)
    {
        int q = 10_000;
        boolean[] isPrime = new boolean[q+1];
        isPrime[2] = true;
        for(int i = 3; i<=q; i+=2)
        {
            isPrime[i] = true;
        }
        for(int p = 3; p*p<=q; p+=2)
        {
            if(isPrime[p])
            {
                for(int i = p*p; i<=q; i+=p)
                {
                    isPrime[i] = false;
                }
            }
        }
        
        HashSet<Integer> squares = new HashSet<Integer>();
        for(int i = 0; i<40; i++)
        {
            squares.add(i*i);
        }
        
        for(int i = 9;; i+=2)
        {
            if(isPrime[i])
            {
                continue;
            }
            int p = 3;
            for(; p<=q; p+=2)
            {
                if(isPrime[p] && squares.contains(i-p >> 1))
                {
                    break;
                }
            }
            if(p > q)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
