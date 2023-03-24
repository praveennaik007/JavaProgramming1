
public class StringFirstCharUp {
public static void main(String[] args) {
	String s="    praveen    kumar   naik";
	char ch[]=s.toCharArray();
	int size=ch.length;
	ch[0]=(char)(ch[0]-32);
	int i=1;
	while(i!=size)
	{
		if(ch[i]==' ')
		{
			ch[i+1]=(char)(ch[i+1]-32);
		}
		i++;
	}
	System.out.println(ch);
}
}
