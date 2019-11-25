package CollectionsTest;

public class number10 {

		public static void StrConcat(String str1)  
		{
			str1 = str1 + "Fatima"; 
		}
		public static void StrBufConcat(StringBuffer str2) 
		{
			str2.append("Fatima"); 
		}
	
		public static void main(String[] args) {
		
		String str1 = " Hey";
		StrConcat(str1);
		System.out.println("The final String is - " +str1); 
		
		StringBuffer str2 = new StringBuffer("Hello");
		StrBufConcat(str2);
		System.out.println("The final string is - " +str2);
	
//String building and buffing 
	}

}
