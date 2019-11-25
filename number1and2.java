package CollectionsTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class number1and2 {
public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(13, "Apples");
		hash.put(6, "Oranges");
		hash.put(9, "Peaches");
		hash.put(15, "Kiwi");
		
		Set set = hash.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("The quantity of fruit is: "+ mentry.getKey() + " & fruit is: ");
			System.out.println(mentry.getValue());
			
		
	}
	}
}

//iterating Hashmap & sorting hashmap by keys