package oop;

public class StaticExam {
	static int num = 1;
	
	public static void main(String[] args) {
		System.out.println(num);
		//System.out.println(StaticExam.num); 사실 이게(StaticExam) 생략된거임
	}
}
//java는 static먼저 읽어
//static으로 실행된아이는 초기화 딱 한번만! 한다.  즉, 다시못함