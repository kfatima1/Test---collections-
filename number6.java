package CollectionsTest;

import java.util.ArrayList;
import java.util.LinkedList;

public class number6 {

	public static void main(String[] args) {
		   
		LinkedList<String> linkedlist = new LinkedList<String>();
		    linkedlist.add("Nat");
		    linkedlist.add("Pat");
		    linkedlist.add("Sat");
		    linkedlist.add("Cat");
		    linkedlist.add("Hat");
		    ArrayList <String> li = new ArrayList<String>(linkedlist);
		    for (String str : li){
		      System.out.println(str);
	}
	}
}
//Linked list to array list 
