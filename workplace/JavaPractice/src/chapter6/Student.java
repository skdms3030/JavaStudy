package chapter6;

public class Student {
	String name;  //학생이름
	int ban;  //반
	int no;  //번호
	int kor;  //국어점수
	int eng;  //영어점수
	int math;  //수학점수
	
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
