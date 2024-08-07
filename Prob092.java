public class Prob092
{
    public static void main(String[] args)
    {
        int count = 0;
        for(int n = 1; n<10_000_000; n++)
        {
            int copy = n;
            while(copy != 1 && copy != 4)
            {
                int x = 0;
                while(copy > 0)
                {
                    x += (copy%10) * (copy%10);
                    copy /= 10;
                }
                copy = x;
            }
            if(copy == 4)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
