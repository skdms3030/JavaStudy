package chapter5;

public class Exercise5_3 {
	//�迭 �ȿ� ��簪�� ���ϱ�
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum="+sum);

	}

}