package chapter4;

public class Exercise4_4 {
	//1+(-2)+3(-4)+..  몇개까지 더해야 총합이 100이상이 되는지
	public static void main(String[] args) {
		int x=0;
		int hap=0;
		
		while(hap<100) {
			x++;
			
			if(x%2==0) 
				hap -=x;
			else 
				hap +=x;
		}
		
		System.out.println(x);

	}

}
