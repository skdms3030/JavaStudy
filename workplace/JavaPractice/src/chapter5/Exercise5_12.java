package chapter5;

import java.util.Scanner;

public class Exercise5_12 {
	//���� ����
	public static void main(String[] args) {
		String [][] words = {
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer","����"}
		};
		
		Scanner s = new Scanner(System.in);
		
		int count = 0;
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����?",i+1, words[i][0]);
			
			String tmp = s.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("�����Դϴ�");
				count++;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������"+words[i][1]+"�Դϴ�");
			}
		}
		
		System.out.println("��ü "+words.length+"�� "+count+"������ ������ϴ�");

	}

}