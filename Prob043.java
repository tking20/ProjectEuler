import java.util.*;

public class Prob043
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("0");
        for(int i = 1; i<10; i++)
        {
            ArrayList<String> temp = new ArrayList<String>();
            for(String s : list)
            {
                for(int j = 0; j<=s.length(); j++)
                {
                    temp.add(new StringBuilder(s).insert(j, ""+i).toString());
                }
            }
            list = temp;
        }

        long sum = 0;
        int[] primes = {17, 13, 11, 7, 5, 3, 2};
        for(String s : list)
        {
            long x = Long.parseLong(s);
            long copy = x;
            boolean good = true;
            for(int j = 0; j<primes.length; j++, x /= 10)
            {
                if(x % 1000 % primes[j] != 0)
                {
                    good = false;
                    break;
                }
            }
            if(good)
            {
                sum += copy;
            }
        }
        System.out.println(sum);
    }
}
