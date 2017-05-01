package thinking_chapter4;

public class OrderOfInitailization {

	public static void main(String[] args) {
		Card card = new Card();
		card.print();
	}
}

class Tag {
	Tag(int marker) {
		System.out.println("Tag(" + marker + ")");
	}
}

class Card {
	Tag t1 = new Tag(1);
	Card() {
		System.out.println("Card() 无参构造器被调用。。");
		t3 = new Tag(3);
	}
	Tag t2 = new Tag(2);
	void print() {
		System.out.println("f()方法被调用。。");
	}
	
	Tag t3 = new Tag(233);
}