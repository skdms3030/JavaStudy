package chapter5;

import java.util.Scanner;

public class Exercise5_13 {
	//�ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���߱�
	public static void main(String[] args) {
		String[] words = {"television","computer","mouse","phone"};
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for(int j=0; j<question.length; j++) {
				int random = (int) (Math.random()*question.length);
				char tmp;
				
				tmp = question[j];
				question[j] = question[random];
				question[random] = tmp;
			}
			
			System.out.print("Q"+i+". ");
			
			for(int x=0; x<question.length; x++) {
				System.out.print(question[x]);

			}
			System.out.println("�� ������ �Է��ϼ���");
			String input = s.nextLine();
			
			if(words[i].equals(input.trim())) {
				System.out.println("�¾ҽ��ϴ�");
				System.out.println();
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�");
				System.out.println();
			}
		}

	}

}