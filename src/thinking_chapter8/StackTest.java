package thinking_chapter8;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		String[] month = {"一月", "二月", "三月" ,
				"四月", "五月", "六月", "七月", "八月", 
				"九月", "十月", "十一月", "十二月"};
		
		Stack<String> stack = new Stack<String>();
		
		for (int i = 0; i < month.length; i++) {
//			stack.add(month[i]);
			stack.push(month[i]);// 元素压栈
		}
		System.out.println(stack);
		
		System.out.println("栈顶元素是 ：" + stack.peek()); //找到栈顶元素
		
		System.out.println("栈是空的吗？" + stack.empty());
		System.out.println(stack.capacity());
		
		System.out.println("栈第一个元素 ：" + stack.firstElement());
		System.out.println("栈最后一个元素 ： " + stack.lastElement());
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + ", ");
		}
		System.out.println("栈是空的吗？" + stack.empty());
	}
}
