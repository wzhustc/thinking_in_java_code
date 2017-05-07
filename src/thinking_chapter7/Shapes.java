package thinking_chapter7;

public class Shapes {

	public static Shape chooseShape() {
		switch((int) (Math.random() * 3)) {
		default:
		case 0: 
			return new Circle();
		case 1: 
			return new Square();
		case 2: 
			return new Triangle();
		}
	}
	
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = chooseShape();
		}
		for (int i = 0; i < s.length; i++) {
			s[i].draw();
		}
	}
}

class Shape {
	void draw(){}
	
	void erase(){}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Circle.draw()");
	}
	
	@Override
	void erase() {
		System.out.println("Circle.erase()");
	}
}

class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Square.draw()");
	}
	
	@Override
	void erase() {
		System.out.println("Square.erase()");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("Triangle.draw()");
	}
	
	@Override
	void erase() {
		System.out.println("Triangle.erase()");
	}
	
}