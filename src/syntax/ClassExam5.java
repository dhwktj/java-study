package syntax;

public class ClassExam5 {
	int a =2;
	
	ClassExam5(){
		System.out.println("난 기본 생성자!");
//같은 생성자면 2개 된다
		//같은파라메터거나,위치가 다르거나, 
	}
	ClassExam5(int a){
		System.out.println("난 기본 생성자아님!");
	}
	public static void main(String[] args) {
		ClassExam5 ce = new ClassExam5(1);  //new ClassExam5(1) 에서 1을지우면 (난 기본생성자!) 가 출력
		ce.a = 4;
		System.out.println(ce.a);
	}
}

//초기화하고싶을때 생정자에서 코딩한다.

/*(new ClassExam5()).a = 4;
ce = new ClassExam5();
System.out.println(ce.a);
System.out.println(new ClassExam5().a);*/
