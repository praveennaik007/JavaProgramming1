import java.util.Scanner;

public class ValidEmail {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the mail ");
	String s=sc.nextLine();
	if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
	{
	if(s.endsWith(".com") || s.endsWith(".in") || s.endsWith(".org"))
		{
			if(s.contains("@"))
					{
						System.out.println("valid email id");
					}
			
		}
	
	}
	else
	{
		System.out.println("not valid");
	}	
		
	
	
}
}
