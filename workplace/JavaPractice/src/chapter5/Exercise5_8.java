package chapter5;

public class Exercise5_8 {
	//배열에 담기 데이터를 읽고 별찍기
	public static void main(String[] args) {
		int [] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int [] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			counter[answer[i]-1]++;
		}
		
		for(int j=0; j<counter.length; j++) {
			System.out.print(counter[j]);
			for(int k=0; k<counter[j]; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
