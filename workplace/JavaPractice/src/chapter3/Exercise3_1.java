package chapter3;

public class Exercise3_1 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';  //'A'�� �����ڵ�� 65
		
		System.out.println(1 + x << 33);  //33�� 1�� ����Ʈ�ϰԵǾ 6
		System.out.println(y >= 5 || x < 0 && x > 2);  //�� ������ ó���� ���������� (&&�� ||���� �켱���� ����)
		System.out.println(y += 10 - x++);  //�ᱹ�� y�� ����϶� ��
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