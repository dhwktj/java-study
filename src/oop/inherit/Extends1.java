package oop.inherit;

class Mother{
	int age = 55;
	String name  = "그라아";
	Mother(){
		System.out.println("난 엄마생성자");
	}
	void attack() {
		System.out.println("엄마 짝!");
}
}
public class Extends1 extends Mother{
	Extends1() {
		System.out.println("난 확장생성자"); //이친구 실행전에 엄마클래스가 가지고있는 모든걸 읽고온다.
		attack();                            //15라인 이후 맴버변수 
	}
	void eat() {
		System.out.println("확장이 먹슴다.");
}
	
	public static void main(String[] args) {
		Extends1 e = new Extends1();
		System.out.println(e.age);
	}
}
/*Extends1 보다 Mother 상위이지만, 포함관계는 아니다. 오히려 크기는 자식이 더 크다.
자식은 마더의 변수들을 사용한수있지만 마더는 19라인의 eat를 사용할수없다.  */

//extends 확장

/*마더 클래스의 변수를 출력하기위해 11,12열 추가
Mother m = new Mother();
System.out.println(m.age);      */