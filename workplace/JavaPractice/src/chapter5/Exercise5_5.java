package chapter5;

public class Exercise5_5 {
	//���� 3�� �ζ� �̱�(�ߺ� ����)
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//�迭 ballArr�� ���� ��Ҹ� ��� ��ġ�� �ٲ۴�
		for(int i=0; i<ballArr.length; i++) {
			int j = (int) (Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		//�迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�
		for(int x=0; x<3; x++) {
			ball3[x] = ballArr[x];
			System.out.print(ball3[x]);
		}

	}

}
