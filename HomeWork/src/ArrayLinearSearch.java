
public class ArrayLinearSearch {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int b= 30;
	boolean rs=false;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==b)
		{
			rs=true;
			break;
		}
		else
		{
			rs=false;
		}
	}
	if(rs==true)
	{
		System.out.println("Linear Search ");
	}
	else
	{
		System.out.println("Not Linear Search ");
	}
}
}
