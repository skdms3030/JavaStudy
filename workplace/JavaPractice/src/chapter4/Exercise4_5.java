package chapter4;

public class Exercise4_5 {
	//for문을 while문으로 변경
	public static void main(String[] args) {
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int i=0;
		int j=0;
		
		while(i<=10) {
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			j=0;
			System.out.println();
			i++;
		}

	}

}
