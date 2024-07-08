public class Prob034
{
    public static void main(String args[])
    {
        int[] fac = new int[10];
        fac[0] = 1;
        for(int i = 1; i<10; i++)
        {
            fac[i] = i*fac[i-1];
        }
        
        int total = 0;
        for(int i = 10; i<50_000; i++)
        {
            int copy = i;
            int sum = 0;
            while(copy > 0)
            {
                sum += fac[copy%10];
                copy /= 10;
            }
            if(sum == i)
            {
                total += i;
            }
        }
        System.out.println(total);
    }
}
