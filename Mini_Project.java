package javaSession;

import java.util.Scanner;

public class Mini_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mini_Project mp = new Mini_Project ();

		mp.creditCardValidator();
		
	}
	
	
	private void creditCardValidator() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter credit card number");
		
		String cardNo = sc.next();
		int card[] = new int [cardNo.length()];
		int sum =0;
		
		for(int i=0;i<card.length;i++)
		{
			card[i] = Character.getNumericValue(cardNo.charAt(i));
			
		}
		for(int i=0;i<card.length;i++)
		{
			if(i%2==0)
			{
				card[i] = card[i]*2;
			}
			if(card[i] >9)
			{
				card[i] = (card[i] % 10) + (card[i] / 10);
				
			}
			
			sum += card[i];
		}
		
		if(sum % 10 ==0)
		{
			System.out.println("Your card is valied");
		}
		else
		{
			System.out.println("Your card is not valied");
		}
		
		
	}
	
	

	
}
