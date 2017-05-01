package thinking_chapter4;

public class Leaf {
	
	private int i = 0;
	
	Leaf increatment() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		Leaf leaf = new Leaf();
		leaf.increatment().increatment().print();
	}
}
