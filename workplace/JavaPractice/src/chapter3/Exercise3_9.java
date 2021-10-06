package chapter3;

public class Exercise3_9 {
	//ch가 영문자이거나 숫자일떄만 true 출력
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
		
		System.out.println(b);
	}
}
