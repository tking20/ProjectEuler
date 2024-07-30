import java.util.*;
import java.io.*;

public class Prob079
{
    public static ArrayList<String> perm(String s)
    {
        ArrayList<String> list = new ArrayList<String>();
        if(s.length() == 1)
        {
            list.add(s);
            return list;
        }
        ArrayList<String> temp = perm(s.substring(1));
        for(String t : temp)
        {
            for(int j = 0; j<=t.length(); j++)
            {
                list.add(new StringBuilder(t).insert(j, s.charAt(0)).toString());
            }
        }
        return list;
    }
    
    public static void main(String[] args) throws IOException
    {
        String[] keys = new String[50];
        Scanner read = new Scanner(new File("keylog.txt"));
        for(int i = 0; i<50; i++)
        {
            keys[i] = read.next();
        }
        read.close();
        
        ArrayList<String> list = perm("01236789");
        for(String s : list)
        {
            boolean good = true;
            for(String k : args)
            {
                if(!s.matches(".*"+k.charAt(0)+".*"+k.charAt(1)+".*"+k.charAt(2)+".*"))
                {
                    good = false;
                    break;
                }
            }
            if(good)
            {
                System.out.println(s);
            }
        }
    }
}
