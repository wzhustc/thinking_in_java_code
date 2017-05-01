package thinking_chapter3;

public class MathOperation {
	public static void print(Object object) {
		System.out.println(object);
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int minus(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static double divide(int x , int y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		print(add(5, 3));
		print(minus(5, 3));
		print(multiply(5, 3));
		print(divide(5, 3));
	}
}
