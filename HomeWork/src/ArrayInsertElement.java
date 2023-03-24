import java.util.Scanner;

public class ArrayInsertElement {
public static void main(String[] args) {
int a[]= {10,20,40,50};
int index=2;
int element=30;
//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter the size ");
//	int n=sc.nextInt();
//	int a[]=new int[n];
//	System.out.println("Enter the elements");
//	for (int i = 0; i < a.length; i++) {
//		a[i]=sc.nextInt();
//	}
//	int b[]=new int[a.length+1];
//	System.out.println("Enter the index position ");
//	int index=sc.nextInt();
//	System.out.println("Enter the element");
//	int element=sc.nextInt();
	
int b[]=new int[a.length+1];
if(index>a.length)
{
	System.out.println("invalid ");
}
else
{
	int j=0;
	for (int i = 0; i < a.length; i++) {
		if(i==index)
		{
			b[j]=element;
			j++;
		}
		b[j]=a[i];
		j++;
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
}
}
}
