import java.util.Scanner;

public class PrimeFactor {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number ");
	int n=sc.nextInt();
	int fact=1;
	for (int i = 2; i < n; i++) {
		if(n%i==0)
		{
		System.out.println(i+" ");
		fact*=i;
		}
	}
	System.out.println(fact);
	
}
}
