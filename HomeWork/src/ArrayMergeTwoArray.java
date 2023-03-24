
public class ArrayMergeTwoArray {
public static void main(String[] args) {
	int a[]= {2,4,6,7,4,15};
	int b[]= {3,5,8,1,9,13};
	int c[]=new int[a.length+b.length];
//	for (int i = 0; i < a.length; i++) {
//		c[i]=a[i];
//	}
//	for (int i = 0; i < b.length; i++) {
//		c[a.length+i]=b[i];
//	}
//	for (int i = 0; i < c.length; i++) {
//		System.out.println(c[i]);
//	}
	int j=0,k=0;
	for (int i = 0; i < c.length; i++) {
		if(i<a.length)
		{
			c[i]=a[j++];
			
		}
		else
		{
			c[i]=b[k++];
		}
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
	
	
}
}
