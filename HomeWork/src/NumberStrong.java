
public class NumberStrong {
public static void main(String[] args) {
	int n=145;
	int count=0;
	while(n>0)
	{
		n/=10;
		count++;
	}
	n=count;
	int sum=0;
	int prod=1;
	int d=n%10;
	for (int i = 0; i < d; i++) {
		prod*=i;
	}
	sum+=prod;
	n/=10;
	if(sum==n)
	{
		System.out.println("Strong number ");
	}
	else
	{
		System.out.println("not Strong number");
	}
}
}
