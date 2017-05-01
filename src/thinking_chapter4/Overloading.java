package thinking_chapter4;

public class Overloading {
	public static void main(String[] args) {
		new Tree();
		new Tree(33);
		new Tree("白杨树", 33);
		new Tree(33, "白杨树");
	}
	
}

class Tree {
	public Tree() {
		System.out.println("这个是空构造方法");
	}
	
	public Tree(int i) {
		System.out.println("tree 有 " + i + " m这么高");
	}
	
	public Tree(String s, int i) {
		System.out.println(s + " tree 有 " + i + " 这么高");
	}
	
	public Tree(int i, String s) {
		System.out.println(s + " tree 有 " + i + " 这么高");
	}
}
