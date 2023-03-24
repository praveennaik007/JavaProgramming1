
public class Anagram {
public static void main(String[] args) {
	String s="abcdefghijklmnopqrstuvwxyz";
	
	int count[]=new int[26];
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
		{
			count[s.charAt(i)-65]++;
		}
		else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		{
			count[s.charAt(i)-97]++;
		}
	}
	boolean rs=true;
	for (int i = 0; i < count.length; i++) {
		if(count[i]==0)
		{
			rs=false;
		}
		else
		{
			rs=true;
		}
	}
	if(rs)
	{
		System.out.println("panagram " );
	}
	else
	{
		System.out.println("not panagram");
	}
}
}
