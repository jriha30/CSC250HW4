import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Please enter a binary number: ");
		String binNum = obj.nextLine();
		System.out.println(binNum);
	}
}