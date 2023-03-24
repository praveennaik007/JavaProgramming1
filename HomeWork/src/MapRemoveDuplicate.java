import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapRemoveDuplicate {
public static void main(String[] args) {
	Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
	String a= "praveen";
	char ch[]=a.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(m.containsKey(ch[i])==false)
		{
			m.put(ch[i], 1);
		}
		else
		{
			int oldval=m.get(ch[i]);
			int newval=oldval+1;
			m.put(ch[i], newval);
		}
	}
	String rs="";
	for (Entry<Character, Integer> e : m.entrySet()) {
		
		rs+=e.getKey();
	}
	System.out.println(rs);
}
}
