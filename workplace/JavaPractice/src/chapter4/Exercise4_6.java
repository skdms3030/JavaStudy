package chapter4;

public class Exercise4_6 {
	//두개의 주사위를 던졌을 때 눈의 합이 6이 되는 경우
	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == 6) {
					System.out.println(i+","+j);
				}
			}
		}

	}

}
