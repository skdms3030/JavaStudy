package programmers;

//���ڿ� �ٷ�� �⺻
public class Solution_12918 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		//String s = "a1234";
		String s = "1234";
		
		//����
		boolean answer = true;
		
		//��
		if(s.length()==4 || s.length()==6) {
			for(int i=0; i<s.length(); i++) {
				if(!(s.charAt(i) <= 'z' && s.charAt(i)>='a')) {
					answer = true;
				}
				else {answer = false; break;}
			}
		}
		else{answer = false;}

		
		System.out.println(answer);
		
	}

}
