package oop.inherit;

public class Final {
	final int num;
	Final(){
		num = 3;
	}
	public static void main(String[] args)  {
		Final f = new Final();      //값이 탄생하는 라인
		System.out.println(f.num);  //f에 값을넘긴다.
		f.num = 3;
	}

}
//final 확장불가, 수정불가, 재정불가 
//final변수는 사용전에 값을 초기화시켜줘야함
//final은 변수앞에만 쓸수있는게 아니다.

//final과 static을 주고 같이 많이쓴다.
