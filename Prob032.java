import java.util.*;

public class Prob032
{
    public static void main(String[] args)
    {
        int q = 100_000;
        HashSet<Integer> product = new HashSet<Integer>();
        for(int a = 1; a<q; a++)
        {
            for(int b = a; a*b<=q; b++)
            {
                int[] c = new int[10];
                long superCopy = 1L*a*b;
                if(superCopy > 1_000_000_000)
                {
                    break;
                }
                int copy = a*b;
                while(copy > 0)
                {
                    c[copy%10]++;
                    copy = copy/10;
                }
                copy = b;
                while(copy > 0)
                {
                    c[copy%10]++;
                    copy = copy/10;
                }
                copy = a;
                while(copy > 0)
                {
                    c[copy%10]++;
                    copy = copy/10;
                }
                if(c[0] > 0)
                {
                    continue;
                }
                boolean d = true;
                for(int i = 1; i<10; i++)
                {
                    d &= c[i] == 1;
                }
                if(d)
                {
                    product.add(a*b);
                }
            }
        }
        int ans = 0;
        for(int x : product)
        {
            ans += x;
        }
        System.out.println(ans);
    }
}
