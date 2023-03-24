import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapUniquePresentOrnot {
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
	for (Entry<Character, Integer> e : m.entrySet()) {
		if(e.getValue()>1)
		{
			System.out.println(e.getKey());
			//System.out.println("Dosen`t contain all unique characters");
			//System.exit(0);
		}
			
	}
	//System.out.println("All Unique Charaters are present");
	char maxkey=' ';
	int maxval=0;
	for(Entry<Character, Integer> e :m.entrySet())
	{
		if(e.getValue()>maxval)
		{
			maxval=e.getValue();
			maxkey=e.getKey();
		}
	}
	System.out.println(maxkey);
	System.out.println(maxval);
}
}
