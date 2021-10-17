package week3.day1;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("kutty");
		String str2 = new String("kutty");
		
		if (str1 == str2) {
			System.out.println("same text");
			
		} else {
			System.out.println("Different Text - Becuase String is a class variabble. use contains or contentequals method to verify its value ");

		}
		System.out.println("***");
		
		if (str1.contentEquals(str2)) {
			System.out.println("Same Text");
			
		} else {
			System.out.println("Diff Text");

		}
		
	}

}
