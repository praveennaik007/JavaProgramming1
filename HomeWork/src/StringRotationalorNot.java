
public class StringRotationalorNot {
public static void main(String[] args) {
	String orgStr="praveen";
	String keyStr="pranvee";
	String newStr=orgStr.concat(orgStr);
	if(newStr.contains(keyStr))
	{
		System.out.println("Rotationl String ");
	}
	else
	{
		System.out.println("Not Rotational String ");
	}
}
}
