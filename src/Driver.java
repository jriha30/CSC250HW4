import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		Scanner scannerObj = new Scanner(System.in);
		System.out.print("Please enter a binary number: ");
		String binStr = scannerObj.nextLine();
		System.out.println(binToHex(binStr));
		
	}
	static int binToDec(String binStr)
	{
		double decDouble = 0;
		int counter = 0;
		for(int i = binStr.length() - 1; i >= 0; i--)
		{
			String currentDigitStr = binStr.charAt(i) + "";
			int currentDigitInt = Integer.parseInt(currentDigitStr);
			decDouble += (currentDigitInt * Math.pow(2, counter));
			counter++;
		}
		int decInt = (int)decDouble;
		return decInt;
	}
	static String decToHex(int decInt)
	{
		String key = "0123456789ABCDEF";
		String hexStr = "";
		while(decInt != 0)
		{
			int tempNum = decInt % 16;
			char hexChar = key.charAt(tempNum);
			hexStr = hexChar + hexStr;
			decInt = decInt / 16;
		}
		return hexStr;
	}
	static String binToHex(String binStr)
	{
		binToDec(binStr);
		decToHex(binToDec(binStr));
		return decToHex(binToDec(binStr));
	}
}