
public class StringVowConSp {
public static void main(String[] args) {
	String s="Soft4ware-deveLope6r";
	s = s.toLowerCase();
	int vow=0;int con=0;int sp=0;int num=0;
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		  if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		{ 
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vow++;
			}
			else
			{
			con++;	
			}
		}
		  else if(ch>='0'&&ch<='9')
		{
			num++;
		}	
		else
		{
			sp++;
		}
	}
	System.out.println(vow+" "+con+" "+sp+" "+num);
}
}
