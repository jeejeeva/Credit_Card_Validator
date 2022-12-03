package javaSession;
import java.util.Scanner;

public class PasswordVerification {

	public static void main(String[] args) {
		
		PasswordVerification pv = new PasswordVerification ();
		pv.passwordVerify();

		

	}

		
	private void passwordVerify() {			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password above 8 characters ");
		char ch[] = {' ','`','¬','!','"','£','$','%','^','&','*','(',')','-','_','=','+','{','[','}',']','#','~',
				';',':','@','<',',','.','>','€'};
		String st = sc.nextLine();
		int caps=0;
		boolean boo = false, bool = false, bo = false, bol = false;
		
		if(st.length() >=8)
		{
			if(st.charAt(0) >= 'A' && st.charAt(0) <= 'Z')
			{
				;
				caps++;
				for(int i =0;i<st.length();i++)
				{
					if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z')
					{
						boo = true;
					}
					else if(st.charAt(i) >= '0' && st.charAt(i) <= '9')
					{
						bool = true;
					}
					for(int j =0;j<ch.length;j++)
					{
						if (st.charAt(i) == ch[j])
						{
							bol = true;
						}
					}
					
				}
			}
			else 
			{
				System.out.println("The first letter must be captalized");
			}
			
		}
		
		else
		{
			System.out.println("Your password is weak set again");
			System.out.println("Re-enter your password");
			System.out.println();
			passwordVerify();
		}
		
		if(boo && bol == bool && caps >0)
		{
			System.out.print("your password is = ");
			for(int i=0;i<st.length();i++) {
				System.out.print(st.charAt(i));
			}
			System.out.println();
			System.out.println(" Your password valid");
			System.out.println(" Accept your password");
			System.out.println("..........PERFECT..........");
		}
		
		else 
			{
			 
				System.out.println();
				System.out.println("Enter atleast one small character");
				System.out.println("Enter atleast one number");
				System.out.println("Enter one special character");
				System.out.println("Check your password");
			}
		
	
		
	}
 
}

