
public class RemoveBarSpaceAndTabSpace {
public static void main(String[] args) {
	String s="Praveen is 	cool 	person based on his 	mood";
//	s=s.replaceAll(" ", "");
//	System.out.println(s);
//	s=s.replaceAll("\\t", "");
//	System.out.println(s);
	s=s.replaceAll("\\s", "");
	System.out.println(s);
}
}
