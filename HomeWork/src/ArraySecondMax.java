
public class ArraySecondMax {
public static void main(String[] args) {
	int a[]= {50,20,30,40,10};
	int fmax=a[0];
	int smax=a[1];
	for (int i = 1; i < a.length; i++) {
		if(a[i]>fmax)
		{
			smax=fmax;
			fmax=a[i];
		}
		else if(a[i]>smax)
		{
			smax=a[i];
		}	
	}
	
	System.out.println(fmax);
	System.out.println(smax);
}
}
