import java.util.Arrays;

public class Prob035
{
    public static void main(String args[])
    {
        int q = 1_000_000;
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
        
        int count = 1;
        int y = 1;
        int z = 10;
        for(int i = 3; i<q; i+=2)
        {
            if(i > z)
            {
                y++;
                z *= 10;
            }
            boolean end = false;
            int copy = i;
            for(int j = 0; j<y; j++)
            {
                int x = copy%10;
                copy = z*x/10 + copy/10;
                if(!isPrime[copy])
                {
                    end = true;
                    break;
                }
            }
            if(!end)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
