package syntax;

public class ThreeSixNine {
//3,6,9,일때 짝!
	public static void main(String[] args) {
		for (int i = 1; i < 30; i++) {
			int mod = i% 10;
			if (mod == 3 || mod == 6 || mod == 9) {
			//if (i == 3 || i == 6 || i == 9) {
				System.out.println("짝!");
			} else {
				System.out.println(i);
			}
		}
	}
}


//tip 10으로 나머지를 죠져버리기