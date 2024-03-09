import java.util.ArrayList;
import java.util.Collections;

public class Prob024
{
	public static ArrayList<String> perm(String s)
	{
		ArrayList<String> list = new ArrayList<String>();
		if(s.length() < 2)
		{
			list.add(s);
			return list;
		}
		ArrayList<String> temp = perm(s.substring(1));
		for(String s2 : temp)
		{
			for(int j = 0; j<=s2.length(); j++)
			{
				list.add(new StringBuilder(s2).insert(j, s.charAt(0)).toString());
			}
		}
		return list;
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> list = perm("0123456789");
		Collections.sort(list);
		System.out.println(list.get(999_999));
	}
}