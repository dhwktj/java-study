package method;

public class Method2 {
	static void add(int a, int b) {
		      //add는 int라 불릴수있는 파라메터 무조건 2개 / 
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		add(1,0);
		int a = 1;
		add(a,3);
		int b = 10;
		add(a,b);
		//System.out.println(int(a,b)) 안됨
	}
}
