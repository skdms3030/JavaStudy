package chapter4;

public class Exercise4_8 {
	//������ 2x+4y=10�� �ظ� ���ϱ�
	public static void main(String[] args) {
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(x+2*y==5) {
					System.out.println("x="+x+", "+"y="+y);
				}
			}
		}

	}

}
