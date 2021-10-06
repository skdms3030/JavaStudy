package chapter5;

public class Exercise5_5 {
	//숫자 3개 로또 뽑기(중복 제거)
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//배열 ballArr이 임의 요소를 골라서 위치를 바꾼다
		for(int i=0; i<ballArr.length; i++) {
			int j = (int) (Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
		for(int x=0; x<3; x++) {
			ball3[x] = ballArr[x];
			System.out.print(ball3[x]);
		}

	}

}
