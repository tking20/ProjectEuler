import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Prob022
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner read = new Scanner(new File("names.txt"));
		String[] names = read.next().replaceAll("\"", "").split(",");
		read.close();
		Arrays.sort(names);
		int ans = 0;
		for(int i = 0; i<names.length; i++)
		{
			int sum = 0;
			for(char c : names[i].toCharArray())
			{
				sum += c-64;
			}
			ans += sum*(i+1);
		}
		System.out.println(ans);
	}
}