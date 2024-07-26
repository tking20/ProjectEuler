import java.util.*;

public class Prob038
{
    public static void main(String[] args)
    {
        String largest = "";
        for(int i = 1; i<10_000; i++)
        {
            int[] nums = new int[10];
            String ans = "";
            for(int j = 1; j<10; j++)
            {
                int copy = i*j;
                ans += copy;
                while(copy > 0)
                {
                    nums[copy%10]++;
                    copy /= 10;
                }
                if(nums[0] > 0)
                {
                    break;
                }
                String s = Arrays.toString(nums).replaceAll("[\\[, \\]]", "");
                if(s.contains("2") || s.equals("0111111111"))
                {
                    break;
                }
            }
            if(Arrays.toString(nums).replaceAll("[\\[, \\]]", "").equals("0111111111"))
            {
                largest = ans;
            }
        }
        System.out.println(largest);
    }
}
