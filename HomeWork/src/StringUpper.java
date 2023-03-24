
public class StringUpper {
public static void main(String[] args) {
	String s="praveen kumar naik ";
	s=s.replace(" ", "");
	char ch[]=s.toCharArray();
	
	int size=ch.length;
	int i=0;
	while(i!=size)
	{
		ch[i]=(char)(ch[i]-32);	
		i++;
	}
	
	System.out.println(ch);
}
}
