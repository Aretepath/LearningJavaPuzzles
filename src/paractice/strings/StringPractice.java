package paractice.strings;


public class StringPractice {
public static void main(String[] args) {
	//System.out.println("Hello World");
	
	int mikesAge = 10;
	int bobsAge = 12;
	
	//conditional block
	if(mikesAge != bobsAge) {
		//do this
		System.out.println("ages are different");
	} else {
		// else do this
	    System.out.println("ages are the same set");
	    
	} //testpush
	
	String a = "hello";
	String b = "there";
	
	if(!a.equals("hello")) {
		//do this
	}
	
	if(b.equalsIgnoreCase("There")) {
		System.out.println("Printed There");
	}
	
	System.out.println(a.charAt(3));
	
	String str = "Hello there yogi there";
	
	int c = str.indexOf("there", 7);
	int d = str.lastIndexOf("yogi");
	
	System.out.println(c); //left to rightdhdh
	System.out.println(d); //right to left

}
}
