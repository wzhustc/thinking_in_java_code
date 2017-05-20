package thinking_chapter8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CatsAndDogs {

	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<Cat>();
		
		List<Dog> dogs = new LinkedList<Dog>();
		for (int i = 0; i < 5; i++) {
			cats.add(new Cat(i));
		}
		
		for (int i = 0; i < 3; i++) {
			dogs.add(new Dog(i));
		}
		// 报错，因为list里面存放的是cat对象，不能把一个dog对象放到cat的笼子里面当做一个cat
//		cats.add(new Dog(5)); // error
		
		for (int i = 0; i < cats.size(); i++) {
			Cat cat = (Cat)cats.get(i);
//			cat.print();
			System.out.println(cat);
		}
		
		System.out.println("------------------");
		
		for (Cat cat : cats) {
			System.out.println(cat);
		}
		System.out.println("-------------------");
		
		for (Dog dog : dogs) {
			System.out.println(dog);
		}
	}
}


class Cat {
	private int catNumber;
	
	public Cat(int i) {
		catNumber = i;
	}
	
	void print() {
		System.out.println("Cat #" + catNumber);
	}
	
	@Override
	public String toString() {
		return "这是小猫 " + catNumber;
	}
}

class Dog {
	private int dogNumber;
	public Dog(int i) {
		dogNumber = i;
	}
	@Override
	public String toString() {
		return "这是小狗 " + dogNumber;
	}
}