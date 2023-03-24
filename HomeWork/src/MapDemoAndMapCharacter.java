import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemoAndMapCharacter {
public static void main(String[] args) {
	Map<Character,Integer> m=new LinkedHashMap();
//	m.put(1, "Praveen");
//	m.put(2, "Hari");
//	m.put(3, "Rick");
//	m.put(4, "Raju");
//	m.put(5, "Praveen");
//	m.put(6, "Vikas");
//	m.put(7, "Mahanthesh");
	//System.out.println(m);
	//System.out.println(m.get(6));
	String a= "praveen";
	char ch[]=a.toCharArray();
	for (int i = 0; i <ch.length ; i++) {
		if(m.containsKey(ch[i])==false)
		{
			m.put(ch[i], 1);
		}
		else
		{
			int value=m.get(ch[i]);
			int newvalue=value+1;
			m.put(ch[i], newvalue);
		}
	}
	for (Entry<Character,Integer> e :m.entrySet() ) {
		if(e.getValue()>=1)
		{
		System.out.print(e.getKey());
		System.out.println(e.getValue());
		}
	}
}
}
