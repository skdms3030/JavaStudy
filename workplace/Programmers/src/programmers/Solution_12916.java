package programmers;

//���ڿ� �� p�� y�� ����
public class Solution_12916 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		//String s = "pPoooyY";
		String s = "Pyy";
		
		//����
		int count_p = 0;
		int count_y = 0;
		boolean answer;
		
		
		//���� ����
		for(int i=0; i<s.length(); i++) {
			if(s.toUpperCase().charAt(i) == 'P') 
				count_p++;
			if(s.toUpperCase().charAt(i) == 'Y') 
				count_y++;
		}
		
		//���� ��
		if(count_p == count_y) 
			answer = true;
		else 
			answer = false;
		
		System.out.println(answer);
		
		
	}

}
