import java.util.*;

public class Prob041
{
    public static void main(String[] args)
    {
        int q = 10_000_000;
        boolean[] isPrime = new boolean[q+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int p = 2; p*p<=q; p++)
        {
            if(isPrime[p])
            {
                for(int i = p*p; i<=q; i+=p)
                {
                    isPrime[i] = false;
                }
            }
        }
        int max = 0;
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        for(int n = 2; n<=7; n++)
        {
            ArrayList<String> temp = new ArrayList<String>();
            for(String s : list)
            {
                for(int j = 0; j<=s.length(); j++)
                {
                    temp.add(s.substring(0, j)+n+s.substring(j));
                }
            }
            list = temp;
            for(String s : list)
            {
                int x = Integer.parseInt(s);
                if(isPrime[x])
                {
                    max = Math.max(max, x);
                }
            }
        }
        System.out.println(max);
    }
}
