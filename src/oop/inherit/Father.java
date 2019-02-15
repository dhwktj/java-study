package oop.inherit;

class GrandFather {
	void work() {
		System.out.println("할아버지 농사일중.");
}
}
public class Father extends GrandFather {
	void work() {
		super.work(); //할아부지의 work도(("할아버지 농사일중") 같이 출력하고싶을때
		System.out.println("아빠가 일함.");
	}
}
public class Son extends Father{
	
	void work() {
		//this.work(); 나를 출력
		super.work(); //아빠의 work도(("아빠가 일함") 같이 출력하고싶을때
		System.out.println("아들이 공부함.");
	}

	public static void main(String[] args)  {
		Son s = new Son();
		s.work();
	}
}

//아빠의 void work() 아들의 void work()둘다 파라메터가 없다. 때문에 아래있는 아들의 void work()를 실행한다.

/*오버라이딩 조건  -  중요!!
1.무조건 상속
2.메서드명이 같아야함
3.해당 메서드의 데이터타입이 동일해야함
4.파라미터 데이터타입,갯수,위치 동일해야함 */

/*오버로딩 조건
같은 영역에 있어야한다.
메서드명이 같아야한다
파라미터의 데이터타입이나 갯수,위치가 달라야함 */

//아빠는 Super 나는 This
//모든클래스의 최상위는 Object