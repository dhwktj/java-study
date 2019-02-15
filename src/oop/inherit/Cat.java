package oop.inherit;

public class Cat extends Animal{
	Cat(int age, String type){
		this.age = age;
		this.type = type;
}
	public static void main(String[] args)  {
		Cat cat = new Cat(6, "샴");
		cat.eat();
		cat.sleep();
		cat.run();
		Animal animal = new Dog(6, "푸들");
		//Dog dog = new Dog(6, "푸들");  (dog가 Animal을 상속받기 때문에 가능,  반대의경우는 불가능하다.)
		animal.eat();
		animal.sleep();
		animal.run();
	//	dog.eat();
	//	dog.sleep();
	//	dog.run();
		
	//	Dog dog = new Animal();
	}
}
