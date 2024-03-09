import java.util.HashMap;

public class Prob026
{
	public static void main(String[] args)
	{
		int max = 0;
		int t = 0;
		for(int d = 2; d<1000; d++)
		{
			int v = 10;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int pos = 0;
			while(true)
			{
				int r = v % d;
				if(r == 0)
				{
					break;
				}
				else if(map.containsKey(r))
				{
					int l = pos - map.get(r);
					if(l > max)
					{
						max = l;
						t = d;
					}
					break;
				}
				map.put(r, pos);
				v = 10*r;
				pos++;
			}
		}
		System.out.println(t);
	}
}