
public class StringDeleteAllOccurance {
public static void main(String[] args) {
	

	String s="Praveen kumar naik";
	
	char ch[]=s.toCharArray();
	int size=ch.length;
	char key='a';
	int i=0;
	String rs="";
	while(i!=size)
	{
		if(ch[i]!=key)
		{
		rs+=ch[i];	
		}
		i++;
	}
	System.out.println(rs);
}
}
