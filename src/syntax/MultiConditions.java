package syntax;

public class MultiConditions {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 4;
		
		if (num1==1 && num2==4 /*&& num1==num2*/) {
			             // &&(그리고) - 추가로 조건문 추가한것
			System.out.println("어게이");
		}else {
			System.out.println("ㅈㅅ ㅎㅎ");
		}
		
		if (num1==2 && num2==3) {
			System.out.println("어게이");
		} else {
			System.out.println("ㅈㅅ ㅎㅎ");
	}
} 
	}
