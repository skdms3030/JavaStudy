package algorithm;

//���ڿ��� ����Ʈ
public class Recursion8 {

	public static void main(String[] args) {
		printChars("ace");

	}

	private static void printChars(String str) {
		if(str.length()==0)
			return;
		else {
			System.out.print(str.charAt(0));	//������ �Ǿձ��ڸ� ���
			printChars(str.substring(1));	//������ �Ǿձ��� �� ������ �ٽ� printChars �Լ���
		}
	}

}
