import java.util.Scanner;

public class Assignment4
{

	public static void main(String []args)
	{
		System.out.println("Please enter month...");
		Scanner input=new Scanner(System.in);
		
		switch(input.nextLine())
		{
		
		case "january":
			System.out.println("31 Days");
			break;
		case "february":
			System.out.println("29 Days");
			break;
		case "march":
			System.out.println("31 Days");
			break;
		case "april":
			System.out.println("30 Days");
			break;
		case "may":
			System.out.println("31 Days");
			break;
		case "june":
			System.out.println("30 Days");
			break;
		case "july":
			System.out.println("31 Days");
			break;
		case "august":
			System.out.println("31 Days");
			break;
		case "september":
			System.out.println("30 Days");
			break;
		case "october":
			System.out.println("31 Days");
			break;
		case "november":
			System.out.println("30 Days");
			break;
		case "december":
			System.out.println("31 Days");
			break;
		}
		
	}
}
