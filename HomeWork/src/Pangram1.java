
public class Pangram1 {
public static void main(String[] args) {
String s="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
	
	s=s.replace(" ","");
	char ch[]=s.toCharArray();
	int size=ch.length;
	int a[] =new int[26];
	int i=0;
	while(i!=size)
	{
		int index=(ch[i]-65);
		a[index]=1;
		i++;
	}
	int j=0;
	boolean rs=true;
	while(j!=25)
	{
		if(a[j]==0)
		{
		rs=false;	
			break;
		}
		j++;
	}
	if(rs)
	{
		System.out.println("Pangram ");
	}
	else
	{
	System.out.println(" Not Pangram ");
	}
}
}
