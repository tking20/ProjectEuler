public class Prob033
{
    public static void main(String args[])
    {
        int ans = 1;
        for(int n = 10; n<100; n++)
        {
            int a = n/10;
            int b = n%10;
            if(a == 0 || b == 0)
            {
                continue;
            }
            for(int d = n+1; d<100; d++)
            {
                int x = d/10;
                int y = d%10;
                double p = 1.0*n/d;
                if(b == x && 1.0*a/y == p)
                {
                    ans *= d;
                    ans /= n;
                }
            }
        }
        System.out.println(ans);
    }
}
