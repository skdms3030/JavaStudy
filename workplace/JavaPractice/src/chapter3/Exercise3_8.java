package chapter3;

public class Exercise3_8 {
	//코드 오류찾아서 수정하기
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		int c = a + b;
		
		char ch = 'A';
		ch = (char) (ch + 2);
		
		float f =3/2f;
		long l = 3000*3000*3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);

	}

}
