
public class MissingElement {
public static void main(String[] args) {
	int n[]= {1,3,4,5};
	int size=n.length+1;
	System.out.println(size);
	int sum=0;
	for (int i = 0; i < n.length; i++) {
		sum+=n[i];
	}
	System.out.println(sum);
	int totalsum=(size*(size+1))/2;
	int missing=totalsum - sum;
	System.out.println(missing);
	
//	int n[]= {1,2,4,5,6};
//	int keeptrack=n[0];
//	for (int i = 0; i < n.length; i++) 
//	{
//		if(n[i]==keeptrack)
//		{
//			keeptrack++;
//			
//		}
//		else 
//		{
//			System.out.println(i);
//			i++;
//		}
//	}
	
	
}
}
