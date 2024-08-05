import java.util.*;

public class Prob049
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
        for(int j = 3; j*j<=n; j++)
        {
            if(n % j == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static HashSet<String> perm(String s)
    {
        HashSet<String> list = new HashSet<String>();
        if(s.length() == 1)
        {
            list.add(s);
            return list;
        }
        HashSet<String> temp = perm(s.substring(1));
        for(String w : temp)
        {
            for(int j = 0; j<=w.length(); j++)
            {
                list.add(new StringBuilder(w).insert(j, s.charAt(0)).toString());
            }
        }
        return list;
    }
    
    public static void main(String[] args)
    {
        for(int n = 1_001; n<10_000; n+=2)
        {
            if(!isPrime(n) || n == 1487)
            {
                continue;
            }
            HashSet<String> perms = perm(""+n);
            for(String s : perms)
            {
                int x = Integer.parseInt(s);
                int y = x - n;
                if(y <= 0 || !isPrime(x) || !isPrime(x+y) || !perms.contains(x+y+""))
                {
                    continue;
                }
                System.out.println(n+""+x+""+(x+y));
            }
        }
    }
}
