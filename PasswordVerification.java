package javaSession;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PasswordVerification {

	public static void main(String[] args) {
		
		PasswordVerification pv = new PasswordVerification ();

		pv.ebCalculator();

		

	}

	private void ebCalculator() {
		
		Scanner sc = new Scanner(System.in);
		try 
		{
		System.out.println("Enter your used Electricity unit = ");
		int unit = sc.nextInt();
		
		int max = Integer.MAX_VALUE;
		
		if(unit <= 100)
			{
				System.out.println("Your used Eletricity unit below 100 units ");
				System.out.println("You are not eligible for Bill payment");
			}
		else if(unit <= 200)
			{
				unit -= 100;
				double bill =  unit * 3.5;
			
				System.out.println("your used above 100 units");
				System.out.println("Amount = "+bill);
			}
		
		else if(unit <= 500)
			{
				unit -= 100;
				double bill = unit * 4.6;
				System.out.println("your used above 200 units");
				System.out.println("Amount = "+bill);
			}
		else if(unit > 500)
			{
				unit -= 100;
				double bill = unit * 6.6;
				System.out.println("Your used above 500 units");
				System.out.println("Amount = "+bill);
			}
			
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter only numbers");
			ime.printStackTrace();
			ebCalculator();
		}
		catch(Exception e)
		{
			System.out.println("Check it your Request !");
			e.printStackTrace();
		}
		
		
		
	}
	
 
}

