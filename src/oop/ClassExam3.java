package oop;

public class ClassExam3 {

	int num = 1;
	
	void setNum(int num) {
		System.out.println(num);
		
	}
	
	int getNum() {
		return num;
	}
	
	public static void main(String[] args) {
		ClassExam3 ce = new ClassExam3();//ClassExam3() 기본생성자
		System.out.println(ce.num);
		System.out.println(ce.getNum());
		ce.num = 5; //여기까지는 1,1,5가 출력됨
		ce=new ClassExam3(); // 다시 초기화를 해줌으로써 윗줄까지의 num과는 값이 다름 1,1,1,나옴
		System.out.println(ce.getNum());
		ce.setNum(3);
		}
	
	}
