package syntax;

public class AreaCondition {

	public static void main(String[] args) {
		int i = 2;

		if (i == 10) { //여기서 i의 값을 i<5로 변경하여도 if문은 현재 15열까지가 한세트이기때문에 아래의 출력값은 계산하지않는다.
			System.out.println("i는 1");
		} else if (i < 10) {
			System.out.println("i는 10보다 작다");
		} else if (i > 10) {
			System.out.println("i는 10보다 크다");
		} else {
			System.out.println("i는 10이다");
		}
	}
}
