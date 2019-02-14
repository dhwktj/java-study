package oop;

public class ClassExam {
	int[] nums = new int[3];
	String str = "abc";
	
	public static void main(String[] args) {
		ClassExam ce= new ClassExam();
		/*System.out.println(ce.str);
		ce.str = "바꾸자"; //ce가 가지고있는 str값을 바꾼것 
		System.out.println(ce.str);
		ce = null;  //ce값을 없애버린것이다.
		System.out.println(ce.str);  
		*/
		
		//for문을 사용해서 ce가 가지고있는 nums라는 인트형 배열변수에
		//0=>10. 1=>20, 2=>30 이라는 값을 저장하고
		//다시 반복문을 사용하여 System.out.println()으로 출력
		int length = ce.nums.length;
		for (int i=0;i<length;i++) {
			ce.nums[i] =i*10;	
		}
		for (int i=0;i<length;i++) {
			System.out.println(ce.nums[i]);
		}
	}
}
