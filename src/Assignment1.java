import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.out.println("Please enter your age");
		Scanner input=new Scanner(System.in);
		
		int age=input.nextInt();
	
		if(age>=18)
		{
			System.out.println("You are eligible for vote");
		}
		else 
		{
			System.out.println("Sorry!!! you are not elgible for vote please wait for "+(18-age)+"years");
		}

	}

}
