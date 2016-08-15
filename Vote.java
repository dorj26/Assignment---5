import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {

		int age;
		Scanner A= new Scanner (System.in);
		System.out.print("Enter the age");
		age = A.nextInt();
		
		if (age >0 && age <100)
		{
			if(age<18)
				System.out.println("You are not eligible to vote");
			else
				System.out.println("You are eligible to vote");
		}
		else 
			System.out.println("Select a valid age");
	}

}
