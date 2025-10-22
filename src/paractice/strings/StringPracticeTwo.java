package paractice.strings;

public class StringPracticeTwo {

	public static void main(String[] args) {

		boolean hungry = false;
		boolean expression = (3 < 5);

		if (hungry) {
			System.out.println("pigout");

		} else if (!hungry) {
			System.out.println("I'm already full");

		} else {
			System.out.println(" I am sleeping I dont care about hunger");
		}

		if (expression) {
			System.out.println("pigout");

		} else if (!expression) {
			System.out.println("I'm already full");

		} else {
			System.out.println(" I am sleeping I dont care about hunger");
		}

		if (getValue()) {
			System.out.println("Value is True");

		} else if (!getValue()) {
			System.out.println("Value is not True");

		} else {
			System.out.println("No One cares what the value is..");
		}
		
		System.out.println(dogTrouble(true, 6));
		System.out.println(dogTrouble(true, 7));
		System.out.println(dogTrouble(false, 6));

	}

	public static boolean getValue() {
		return (7 < 3) && ((5>3) || (7<3)); // || is OR && is AND

	}
	
	public static boolean dogTrouble(boolean barking, int hour) {
		
		return(barking && (hour < 7 || hour > 20 ));
			
	}
}
