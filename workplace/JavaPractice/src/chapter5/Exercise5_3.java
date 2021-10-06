package chapter5;

public class Exercise5_3 {
	//배열 안에 모든값을 더하기
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum="+sum);

	}

}
