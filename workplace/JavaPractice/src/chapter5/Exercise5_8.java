package chapter5;

public class Exercise5_8 {
	//�迭�� ��� �����͸� �а� �����
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
