package CollectionsTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class number7 {

	public static void main(String[] args) {
		
		String[] array = {"Steak", "Pork", "Chicken"};
	        Set<String> set = new HashSet<>(Arrays.asList(array));
	        System.out.println("Set: " + set);
	}

}
//hashset to array 