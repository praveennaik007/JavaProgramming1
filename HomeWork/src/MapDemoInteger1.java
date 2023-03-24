import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemoInteger1 {
public static void main(String[] args) {
	Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
	int a[]= {1,2,3,4,5,6,1,2};
	for (int i = 0; i < a.length; i++) {
		if(m.containsKey(a[i])==false)
		{
			m.put(a[i], 1);	
		}
		else
		{
			int value = m.get(a[i]);
			int newvalue = value+1;
			m.put(a[i], newvalue);
		}
	}
	for (Entry<Integer,Integer> e : m.entrySet()) {
		if(e.getValue()>1)
		{
			System.out.print(e.getKey());
			System.out.println(e.getValue());
		}
	}
}
}
