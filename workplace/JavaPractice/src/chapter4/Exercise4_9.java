package chapter4;

public class Exercise4_9 {
	//���ڿ� 12345�� ��� ���ڸ� ���ϱ�
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += (int)(str.charAt(i))-48;
		}
		
		System.out.println(sum);

	}

}
