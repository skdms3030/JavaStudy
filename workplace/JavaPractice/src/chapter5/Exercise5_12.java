package chapter5;

import java.util.Scanner;

public class Exercise5_12 {
	//영어 퀴즈
	public static void main(String[] args) {
		String [][] words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		Scanner s = new Scanner(System.in);
		
		int count = 0;
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?",i+1, words[i][0]);
			
			String tmp = s.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("정답입니다");
				count++;
			}
			else {
				System.out.println("틀렸습니다. 정답은"+words[i][1]+"입니다");
			}
		}
		
		System.out.println("전체 "+words.length+"중 "+count+"문제를 맞췄습니다");

	}

}
