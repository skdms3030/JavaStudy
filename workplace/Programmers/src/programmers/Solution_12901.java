package programmers;

//2016��
public class Solution_12901 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		int a=5;	int b=24;
		
		
		//����
		int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int totalDay = 0;
		String result = "";
		
		
		//�� ���
		for(int i=0; i<a; i++) {
			totalDay += month[i];
		}
		
		//�� ���
		totalDay += b;
		
		
		//���� ���
		switch(totalDay % 7) {
		case 0 : result = "THU"; break;
		case 1 : result = "FRI"; break;
		case 2 : result = "SAT"; break;
		case 3 : result = "SUN"; break;
		case 4 : result = "MON"; break;
		case 5 : result = "TUE"; break;
		case 6 : result = "WED"; break;
		}
		
		System.out.println(result);
		//return result;
		
		
	}

}
