import java.util.*;

public class Prob037
{
    public static boolean isPrime(int n)
    {
        if(n < 3)
        {
            return n == 2;
        }
        if((n & 1) == 0)
        {
            return false;
        }
        for(int i = 3; i*i<=n; i+=2)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[])
    {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        for(int i = 23; set.size() < 15; i+=2)
        {
            if(isPrime(i))
            {
                int copy = i;
                boolean good = true;
                while(copy >= 10)
                {
                    copy /= 10;
                    if(!isPrime(copy))
                    {
                        good = false;
                        break;
                    }
                }
                if(good)
                {
                    String s = ""+i;
                    while(s.length() > 1)
                    {
                        s = s.substring(1);
                        if(!isPrime(Integer.parseInt(s)))
                        {
                            good = false;
                            break;
                        }
                    }
                }
                if(good)
                {
                    set.add(i);
                }
            }
        }
        int sum = 0;
        for(int y : set)
        {
            if(y > 7)
            {
                sum += y;
            }
        }
        System.out.println(sum);
    }
}
