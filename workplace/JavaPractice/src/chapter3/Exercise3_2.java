package chapter3;

public class Exercise3_2 {
	//����� ��µ� �ʿ��� �ٱ��� �� ���ϱ�
	public static void main(String[] args) {
		int numOfApples = 123;  //����� ����
		int sizeOfBucket = 10;  //�ٱ����� ũ��
		int numOfBucket = numOfApples/sizeOfBucket+ (numOfApples%sizeOfBucket>0? 1:0);  //�ٱ����� ��
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);

	}

}
