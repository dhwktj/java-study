package syntax;

public class ClassExam {   //클래서 선언
	int a = 1;    //여기서 a 는 ClassExam 꺼야
	char c= '1';
	String s = "1";
	
	void test() {
		System.out.println("난 이그잼꺼");
	
	}

	public static void main(String[] args) {  //얘는 실행의 시작점이다. 로드의 시작점이 아니야!
		int a =1;
		ClassExam ce = new ClassExam();  //메모리생성 and 변수에 설정함   이거안하면 다른곳에 쓰이자마자 ce의 값이바뀜
		System.out.println(ce.a);
		//4열의 a를 쓰기위해 .a를 붙임  (여기서 .은 ~의 과 같은 의미)
		System.out.println(ce.c);
		System.out.println(ce.s);
		//println은 out의 매서드, out은 System의 매서드
		ce.test();
	}

}
//4열의 a 와 9열의 a는 서로 다름 (영역이 다르니까)
//클래스안에 변수,매서드,클래스 된다! 하지만, 매서드안에 매서드선언은 안된다.