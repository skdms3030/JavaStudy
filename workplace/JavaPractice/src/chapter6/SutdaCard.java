package chapter6;

public class SutdaCard {
	int num;  //카드의 숫자
	boolean isKwang;  //광이면 true
	
	SutdaCard(){
		num = 1;
		isKwang = true;
	}
	
	SutdaCard(int i, boolean j){
		num = i;
		isKwang = j;
	}
	
	String info() {
		return num + (isKwang?"K":"");
	}

}
