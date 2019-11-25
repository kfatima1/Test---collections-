package CollectionsTest;

import java.util.ArrayList;

public class number5 {

	public static void main(String[] args) {
		ArrayList<String> veggieList = new ArrayList<String>(); 
		
		veggieList.add("Carrots");
		veggieList.add("Green beans");
		veggieList.add("Potatoes");
		veggieList.add("Lettuce");
	 
		

		veggieList.remove(0);
		veggieList.remove(0);
		
		System.out.println("Removed" + veggieList);
	}

}
//removing elements from specified index of arraylist 