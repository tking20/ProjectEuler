import java.util.*;

public class Prob039
{
    public static void main(String args[])
    {
        HashMap<Integer, Integer> squares = new HashMap<Integer, Integer>();
        for(int i = 1; i<=1000; i++)
        {
            squares.put(i*i, i);
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = 0;
        int max = 0;
        for(int a = 1; a<=1000/3; a++)
        {
            for(int b = a; b<=1000; b++)
            {
                int c = a*a + b*b;
                if(!squares.containsKey(c))
                {
                    continue;
                }
                c = squares.get(c);
                int p = a+b+c;
                if(p > 1000)
                {
                    break;
                }
                map.put(p, 1 + map.getOrDefault(p, 0));
                if(max < map.get(p))
                {
                    max = map.get(p);
                    ans = p;
                }
            }
        }
        System.out.println(ans);
    }
}
