package method;

public class voidMethod {
//모르겠음
	static void test(int sNum, int eNum) {
		for(int i=sNum;i<=eNum;i++) {
			System.out.println(i);
		}
		//System.out.println("test메소드호출");
	}
	public static void main(String[] args) {
		//void는 넘기지 않는성격이있기때문에 호출은 가능하나 값을 대입,저장할수는 없다.
		test(10,30);
	}
}
