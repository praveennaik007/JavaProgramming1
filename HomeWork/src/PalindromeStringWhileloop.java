
public class PalindromeStringWhileloop {
public static void main(String[] args) {
	String s="madam";
	s=s.replace(" ", "");
	s=s.toLowerCase();
	s=s.toUpperCase();
	
	char ch[]=s.toCharArray();
	int size=ch.length;
	int x[]=new int[size];
	for (int i = 0; i < x.length; i++) {
		System.out.println(x[i]);
	}
	int i=0;
	while(i!=size)
	{
		x[size-1-i]=ch[i];
		//System.out.println(x[i]);
		i++;
	}
	//System.out.println(x[i]);
//	 i=0;
//	while(i!=size)
//	{
//		if(x[i]!=ch[i])
//		{
//			System.out.println("Not Palindrome ");
//			System.exit(0);
//		}
//		else
//		{
//			i++;
//			continue;	
//		}
//	}
//	System.out.println("Palindrome ");
}
}
