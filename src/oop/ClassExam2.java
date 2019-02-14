package oop;

public class ClassExam2 {
	String[] strs;
	int num;
	double db;
	boolean bl;
	char c;
	
	public static void main(String[] args) {
	ClassExam2 ce = new ClassExam2();
	//ce.strs[0] = "1";
	System.out.println(ce.strs);
	System.out.println(ce.num);
	System.out.println(ce.db);
	System.out.println(ce.bl);
	System.out.println(ce.c);
	}
	//정해져있는 않는 데이터는 null로 표시됨
	//new로 초기화하는값의 초기값은 null
}
