package programmers;

//���ڿ��� ������ �ٲٱ�
public class Solution_12925 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		//String str = "1234";
		//String str = "+1234";
		String str = "-1234";
		
		//����
		int answer = 1;
		
		/*
		//����, ��� ����
		if(str.charAt(0)=='-') {
			answer *= -1;
			str.replace("-","");
		}
		if(str.charAt(0)=='+') {
			str.replace("+","");
		}
		*/
		
		answer = Integer.parseInt(str);
		
		System.out.println(answer);
		
		
		
		
		
		
	}

}
