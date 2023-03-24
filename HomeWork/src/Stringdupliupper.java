
public class Stringdupliupper {
public static void main(String[] args) {
	String s="praveennaik";
	String str="";
	
	char ch[]=s.toCharArray();
	for (int i = 0; i < s.length(); i++) {
		int count=0;
		if(str.indexOf(ch[i])==-1)
		{
		for (int j = 0; j < s.length(); j++) {
			if(ch[i]==ch[j])
			{
				count++;
			}
		}
		if(count>=1)
		{
			System.out.println();
		System.out.println((char)(ch[i]-32));
	System.out.println();
		System.out.println(count);
		}
		str+=ch[i];
		}
		
		}
	System.out.println();
	System.out.println(str);
	}
	

}

