package chapter5;

import java.util.Scanner;

public class Exercise5_13 {
	//단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추기
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
			System.out.println("의 정답을 입력하세요");
			String input = s.nextLine();
			
			if(words[i].equals(input.trim())) {
				System.out.println("맞았습니다");
				System.out.println();
			}
			else {
				System.out.println("틀렸습니다");
				System.out.println();
			}
		}

	}

}
