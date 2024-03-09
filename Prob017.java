public class Prob017
{
	public static int digit(int n)
	{
		return switch(n)
		{
		case 1: yield 3;
		case 2: yield 3;
		case 3: yield 5;
		case 4: yield 4;
		case 5: yield 4;
		case 6: yield 3;
		case 7: yield 5;
		case 8: yield 5;
		case 9: yield 4;
		default: yield 0;
		};
	}
	public static void main(String[] args)
	{
		int ans = 0;
		for(int i = 1; i<1000; i++)
		{
			int sum = 0;
			if(i >= 100)
			{
				sum += digit(i/100) + "hundred".length();
				if(i % 100 != 0)
				{
					sum += "and".length();
				}
			}
			if(i%100 >= 20)
			{
				sum += switch(i%100/10)
				{
				case 2: yield 6;
				case 3: yield 6;
				case 4: yield 5;
				case 5: yield 5;
				case 6: yield 5;
				case 7: yield 7;
				case 8: yield 6;
				case 9: yield 6;
				default: yield 0;
				};
				sum += digit(i%10);
			}
			else if(i%100 < 10)
			{
				sum += digit(i%10);
			}
			else
			{
				sum += switch(i % 100)
				{
				case 10: yield 3;
				case 11: yield 6;
				case 12: yield 6;
				case 13: yield 8;
				case 14: yield 8;
				case 15: yield 7;
				case 16: yield 7;
				case 17: yield 9;
				case 18: yield 8;
				case 19: yield 8;
				default: yield 0;
				};
			}
			ans += sum;
		}
		System.out.println("onethousand".length() + ans);
	}
}