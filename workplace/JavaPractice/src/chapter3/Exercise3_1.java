package chapter3;

public class Exercise3_1 {
	//연산결과 확인
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';  //'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);  //33을 1번 쉬프트하게되어서 6
		System.out.println(y >= 5 || x < 0 && x > 2);  //비교 연산자 처리후 논리연산자 (&&가 ||보다 우선순위 높음)
		System.out.println(y += 10 - x++);  //결국은 y를 출력하란 뜻
		System.out.println(x+=2);  //5
		System.out.println(!('A' <= c && c <= 'Z'));  //false
		System.out.println('C'-c);  //2
		System.out.println('5' - '0');
		System.out.println(c+1);  //66
		System.out.println(++c);  //B
		System.out.println(c++);  //B
		System.out.println(c);  //C

	}

}
