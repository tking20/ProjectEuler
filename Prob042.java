import java.util.*;
import java.io.*;

public class Prob042
{
    public static void main(String args[]) throws IOException
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 1; i<100; i++)
        {
            set.add(i*(i+1)/2);
        }
        int count = 0;
        
        BufferedReader read = new BufferedReader(new FileReader("/uploads/0042_words.txt"));
        String[] line = read.readLine().split(",");
        for(String s : line)
        {
            int sum = 0;
            for(char c : s.toCharArray())
            {
                if(c != '"')
                {
                    sum += c-'A' + 1;
                }
            }
            if(set.contains(sum))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
