import java.time.LocalDate;

public class Prob019
{
	public static void main(String[] args)
	{
		int ans = 0;
		for(int year = 1901; year<2001; year++)
		{
			for(int month = 1; month<=12; month++)
			{
				if(LocalDate.of(year, month, 1).getDayOfWeek().toString().equals("SUNDAY"))
				{
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}