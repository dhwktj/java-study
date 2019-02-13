package syntax;

public class Gugudab {
//구구단 나열하기
	public static void main(String[] args) {
		for (int j = 29; j > 0; j--) {
			for (int i = 1; i < 10; i++) {
				System.out.print(j + "X " + i + " = " + (j * i) + " , " );
		/*	
		 * if(i!=9) {
				System.out.print(",");
				}
				*/
				//위는i가 9일때, 즉 j*9일때 문장 끝에 (,가 생기는걸 지워주는X) i=9일때 ,를 출력하지 않는 방법이다.
			}
			System.out.println();
		}
	}
}
