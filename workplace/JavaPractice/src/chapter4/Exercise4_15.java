package chapter4;

public class Exercise4_15 {
	//ȸ���� ���ϱ�
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;
		
		while(tmp !=0) {
			result = result*10 + tmp%10;
			tmp = tmp/10;
		}
		
		if(number == result) {
			System.out.println(number + "�� ȸ���� �Դϴ�");
		}
		else {
			System.out.println(number + "�� ȸ������ �ƴմϴ�");
		}

	}

}
