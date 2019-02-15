package oop.inherit;

/*final */ class People{
	String name;
	People(){
		this("무명");
	}
	People(String name) {
		this.name = name;
	}

	/*final */void printInfo() {
		System.out.println("이름"+ name);
	}
}
public class Student extends People {
	int grade;
	Student(int grade) {
		this.grade = grade;
	}
	void printInfo() { //12라인에 funal이 붙는다면 재정이 불가하다.
		System.out.println("학년"+ grade);
		System.out.println("이름"+ name);
	}
	public static void main(String[] args)  {
		Student st = new Student(3);
		st.printInfo();
	}
}