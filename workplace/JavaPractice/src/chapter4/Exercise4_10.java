package chapter4;

public class Exercise4_10 {
	//�빮�ڸ� �ҹ��ڷ� �ٲٴ� �ڵ�
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum += num%10;
			num = num/10;
		}
		
		System.out.println(sum);

	}

}
