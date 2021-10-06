package chapter5;

public class Exercise5_6 {
	//거스름돈을 몇개의 동전으로 지불할 수 있는지
	public static void main(String[] args) {
		int[] coinUnit = {500,100,50,10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {
			int j = money/coinUnit[i];
			System.out.println(coinUnit[i]+"원: "+j+"개");
			money = money%coinUnit[i];
		}

	}

}
