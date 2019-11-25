package CollectionsTest;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class number8 { 
	
	public static void main(String [] args) {
	ListIterator<String> litr = null;
	ArrayList<String> S = new ArrayList<String>();
	
	S.add("jenny"); 
	S.add("jess");
	S.add("fronto");
	S.add("zippy");
	S.add("hips");
	
	
	ListIterator<String> litr1 = S.listIterator(); 
	System.out.println("Traversing the list in forward direction");

	while(litr1.hasNext()); {
		System.out.println(litr1.next());
		{
	System.out.println("\nTraversing the list in backwards direction");
}
	while(litr1.hasPrevious()); {
		System.out.println(litr1.previous());
	}

}
}
}