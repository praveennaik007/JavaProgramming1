
public class StringProgram {
public static void main(String[] args) {
	String s="praveen";
	int count[]=new int[128];
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		
		count[ch]++;
	}
	for (int i = 0; i < count.length; i++) {
		if(count[i]!=0)
		{
			System.out.print((char)i+" "+count[i]);
		}
	}
	System.out.println();
	System.out.println("How many characters present in the Word ");
	String str="praveen";
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		String c="";
		while(i<str.length()&&str.charAt(i)!=' ')
		{
			c+=str.charAt(i);
			i++;
		}
		System.out.println(c+" "+c.length());
	}
	
}
}
