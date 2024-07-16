public class Prob052
{
    public static int[] method(int n)
    {
        int[] ans = new int[10];
        while(n > 0)
        {
            ans[n%10]++;
            n /= 10;
        }
        return ans;
    }
    
    public static boolean equals(int[] a, int[] b)
    {
        for(int i = 0; i<a.length; i++)
        {
            if(a[i] != b[i])
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[])
    {
        for(int n = 1; n<1_000_000; n++)
        {
            int[] nums = method(n);
            boolean good = true;
            for(int j = 2; j<=6; j++)
            {
                if(!equals(nums, method(j*n)))
                {
                    good = false;
                    break;
                }
            }
            if(good)
            {
                System.out.println(n);
                break;
            }
        }
    }
}
