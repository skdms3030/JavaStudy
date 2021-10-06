package chapter6;

public class Student {
	String name;  //�л��̸�
	int ban;  //��
	int no;  //��ȣ
	int kor;  //��������
	int eng;  //��������
	int math;  //��������
	
	Student(){
		
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return (kor+eng+math);
	}
	
	float getAverage(){
		return (int)((kor+eng+math)/3.0f*10+0.5)/10.0f;
	}
	
	String info() {
		return name +","+ ban +","+ no +","+ kor +","+ eng +","+ math +","+ getTotal() +","+ getAverage();
	}

}