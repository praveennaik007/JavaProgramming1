
public class StringConvertInteger {
	public static void main(String[] args) {
         System.out.println("=== Convert String to Integer ===");
        String a="74";
        String m="79";
        int x=Integer.valueOf(a);//String
        int c=Integer.parseInt(m);//String
        System.out.println(x);
        System.out.println(c);
        
      System.out.println("=== Covert Integer to String ===");
       
        int b=54;
        int g=59;
        String d=String.valueOf(b);//int
        String f=Integer.toString(g);//int
        System.out.println(d);
        System.out.println(f);
        
        
	}
}
