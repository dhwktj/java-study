package oop.inherit;

import java.util.Scanner;

class Book{
	String name;
	Book(String name){
		this.name = "책 제목 : " + name;
	}
	Book(){
		this("자바의 정석"); //this("자바의 정석");은 string이다. 5라인도 string이다. 따라서 이 this는 5열
		//this.name = "자바의 정석"; 
	}  
}
public class ConsExam extends Book {
	ConsExam(){
		super();
	}
	public static void main(String[] args)  {
		ConsExam ce = new ConsExam();
		System.out.println(ce.name);
	}
}
