package algorithm;

//���ڿ��� ���� ���
public class Recursion7 {

	public static void main(String[] args) {
		int result = length("ace");
		System.out.println(result);
	}

	private static int length(String str) {
		if(str.equals(""))
			return 0;
		else
			return 1+length(str.substring(1));	//str.substring(1)�� str ������ �Ǿ� 1���ڸ� �A ���ڿ��̶�� ��
	}

}
