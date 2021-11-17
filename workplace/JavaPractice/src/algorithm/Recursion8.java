package algorithm;

//문자열의 프린트
public class Recursion8 {

	public static void main(String[] args) {
		printChars("ace");

	}

	private static void printChars(String str) {
		if(str.length()==0)
			return;
		else {
			System.out.print(str.charAt(0));	//문장의 맨앞글자를 출력
			printChars(str.substring(1));	//문장의 맨앞글자 뺀 문장을 다시 printChars 함수로
		}
	}

}
