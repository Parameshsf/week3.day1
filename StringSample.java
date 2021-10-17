package week3.day1;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("kutty");
		String str2 = new String("kutty");

		if (str1 == str2) {
			System.out.println("same text");

		} else {
			System.out.println(
					"Different Text - Becuase String is a class variabble. use contains or contentequals method to verify its value ");

		}
		System.out.println("***");

		if (str1.contentEquals(str2)) {
			System.out.println("Same Text");

		} else {
			System.out.println("Diff Text");

		}

		// get character at index

		String str3 = "Java Exercise";
		System.out.println("The index of character 'E' from a text "+str3+" is "+str3.indexOf("E"));
		System.out.println("The index of character 's' from a text "+str3+" is "+str3.indexOf("s"));
		
		//Comparing String variables using equals and equalsIgnoreCase methods
		//both the methods check for the same string length but equals method also check for case sensitive
		String s1 = "I am Learning Java";
		String s2 = "I am learning java";
		
		String s3 = "I am Learning Java";
		String s4 = "I am Learning java";
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Using equalsIgnoreCase - Both the String variables are same");
			
		}
		else {
			System.out.println("Using equalsIgnoreCase - Both the strings are not same");
		}
		
		if (s3.equals(s4)) {
			System.out.println("Both the strings are same");
			
		}
		else
		{
			System.out.println("Both the String values are Not same");
		}
		
		//Replace a specified character value in a string variable
		String rep = "I am working with Java 8";
		
		System.out.println("The string varialble has been replaced with 11 "+rep.replace("8", "11"));
		
		

	}

}
