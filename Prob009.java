import java.util.ArrayList;
import java.util.Collections;

public class Prob009
{
	public static void main(String[] args)
	{
		ArrayList<Integer> squares = new ArrayList<Integer>();
		for(int i = 0; i<1000; i++)
		{
			squares.add(i*i);
		}
		for(int a = 1; a<=333; a++)
		{
			for(int b = a; b<500; b++)
			{
				int c2 = a*a + b*b;
				int c = Collections.binarySearch(squares, c2);
				if(c > 0 && a+b+c == 1000)
				{
					System.out.println(a*b*c);
				}
			}
		}
	}
}