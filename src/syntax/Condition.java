package syntax;

public class Condition {

	public static void main(String[] args) {
		int num1 =1;
		int num2 =2;
		
		boolean isEqual = num1==num2;
	
		if(!isEqual) {
			System.out.println("num1과 2는 같다.");
			}else {
				System.out.println("1과2는 다르다.");
			}
	}
}
//같다 ==
//다르다 !=
// !는 부정 연산자이다.
// !true => false
// !false => true
//num1==num2 여기서 == 같다를 의미함
//반대로 ==를 !=로 변경한다면 다르다가 됨
//if(isEqual)에서도 똑같이 적용됨
//if(!isEqual)