package chapter6;

public class SutdaCard {
	int num;  //ī���� ����
	boolean isKwang;  //���̸� true
	
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
