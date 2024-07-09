public class Prob036
{
    public static void main(String args[])
    {
        long sum = 0;
        for(int i = 1; i<1_000_000; i++)
        {
            String s = ""+i;
            if(new StringBuilder(s).reverse().toString().equals(s))
            {
                s = Integer.toBinaryString(i);
                if(new StringBuilder(s).reverse().toString().equals(s))
                {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
