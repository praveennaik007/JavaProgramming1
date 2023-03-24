import java.util.Scanner;

public class SmithNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int sum=0;
	int fact=1;
	for (int i = 2; i < n; i++) {
		
		if(n%i==0)
		{
			fact*=i;			
		}	
	}
	while(fact>0)
	{
		int d=fact%10;
		sum+=d;
		fact/=10;
	}
	int sum1=0;
	while(n>0)
	{
		int x=n%10;
		sum1+=x;
		n/=10;
	}
	
	if(sum==sum1)
	{
		System.out.println("Smith number "+sum);
	}
	else
	{
		
	System.out.println("Not smith Number "+sum);
	}
}
}
