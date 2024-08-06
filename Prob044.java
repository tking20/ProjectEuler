import java.util.*;

public class Prob044
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int n = 1; n<2_500; n++)
        {
            set.add(n*(3*n-1)>>1);
        }
        for(int j : set)
        {
            for(int k : set)
            {
                if(k <= j)
                {
                    continue;
                }
                if(set.contains(k-j) && set.contains(j+k))
                {
                    System.out.println(k-j);
                }
            }
        }
    }
}
