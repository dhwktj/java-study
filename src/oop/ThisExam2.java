package oop;

public class ThisExam2 {

	int num1;
	String str ; 
	
	ThisExam2() {}
	//생성자를 수동으로 입력했기때문에 더이상 자동으로 (보이지않는)생성자를 만들지않는다. 따라서 8열에도 생성해줬음.
	ThisExam2(int num1, String str) {
		this.num1 = num1;
		this.str = str;
		System.out.println(this.num1);
		System.out.println(this.str);
	}
	public static void main(String[] args) {
		ThisExam2 te = new ThisExam2(10,"abc");
	} 
}
