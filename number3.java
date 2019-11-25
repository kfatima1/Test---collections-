package CollectionsTest;

import java.util.Arrays;
import java.util.Collections;

public class number3 {

	public static void main(String[] args) {

		
		Integer[] arr1 = {3,74,55,23,198};
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.printf("Sorted arr[] = %s",
				Arrays.toString(arr1));
				
	}

	
	}
//Sorting array list in descending order 