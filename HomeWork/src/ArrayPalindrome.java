
public class ArrayPalindrome {
public static void main(String[] args) {
	int a[]= {121,123,12321};
	for (int i = 0; i < a.length; i++) {
		int n=a[i];
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(temp==rev)
		{
			System.out.println("palindrome ");
		}
		else
		{
			System.out.println("Not Palindrome ");
		}
	}
}
}
