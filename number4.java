package CollectionsTest;

import java.util.ArrayList;

public class number4 {

	public static void main(String[] args) {
		ArrayList<String> veggieList = new ArrayList<String>(); 
		
		veggieList.add("Carrots");
		veggieList.add("Green beans");
		veggieList.add("Potatoes");
		veggieList.add("Lettuce");
	 
		System.out.println(veggieList);
		
		veggieList.add("Peas");
		veggieList.add("Corn");
		
		System.out.println("Adding" + veggieList);

	}

}
// adding elements to index of arraylist