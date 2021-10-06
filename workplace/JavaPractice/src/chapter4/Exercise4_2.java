package chapter4;

public class Exercise4_2 {
	//1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
	public static void main(String[] args) {
		   int i;
		   int hap=0;
		   
		   for(i=1; i<=20; i++) {
			   if(i%2!=0 && i%3!=0) {
				   hap += i;
			   }
		   }
		   System.out.println(hap);
	}

}
