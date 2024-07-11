public class Prob040
{
    public static void main(String args[])
    {
        int ans = 1;
        int x = 0;
        int y = 1;
        int z = 10;
        for(int n = 1; z<=1_000_000; n++)
        {
            if((""+n).matches("10+"))
            {
                y++;
            }
            if(x + y >= z)
            {
                ans *= (""+n).charAt(z - x - 1) - '0';
                z *= 10;
            }
            x += y;
        }
        System.out.println(ans);
    }
}
