package programmers;

//��� ���� ��������
public class Solution_12903_2 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		String s = "abcde";
		//String s = "qwer";
		//String s = "1";
				
				
				
		//����
		String answer;
		answer = s;
		
		//Ȧ¦ �Ǵ�
		if(s.length()%2 == 0) {
			int gijun = s.length()/2-1;
			answer = s.substring(gijun, gijun+2);
		}
		else {
			int gijun = s.length()/2;
			answer = s.substring(gijun, gijun+1);
		}
		
		System.out.println(answer);

	}

}
