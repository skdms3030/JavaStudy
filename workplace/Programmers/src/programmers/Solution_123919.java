package programmers;

//���￡�� �輭�� ã��
public class Solution_123919 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		String[] seoul = {"Jane", "Kim"};
		
		//����
		int location = 0;
		
		//�輭��ã��
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				location = i;
				break;
			}
		}
		
		System.out.println("�輭���� "+location+"�� �ִ�");
		
		
		
		
		
		
		
	}

}
