package programmers;

//�� ���� ������ ��
public class Solution_12912 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		//int a=3;	int b=5;
		//int a=3;	int b=3;
		int a=5;	int b=3;
		
		//����
		long answer = 0;
		int smallNum = 0;
		int bigNum = 0;
		
		//��� ��
		if(a>b) {
			smallNum = b;
			bigNum = a;
		}
		else if(a<b) {
			smallNum = a;
			bigNum = b;
		}
		
		
		//���
		if(a != b) {
			for(int i=smallNum; i<bigNum+1; i++) {
				answer += i;
			}
		}
		else {answer = a;}
		
		//���
		System.out.println(answer);
		
		
		
		
	}

}
