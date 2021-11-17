package algorithm;

public class Recursion9 {

	public static void main(String[] args) {
		printCharsReverse("ace");

	}

	private static void printCharsReverse(String str) {
		if(str.length()==0)
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}

}
