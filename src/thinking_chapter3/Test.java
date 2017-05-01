package thinking_chapter3;

import java.util.Scanner;

/**
 * 此程序用于和输入的int型值做比较，并给出提示，比目标值大或者小
 * @author v_zhangwei13
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			new Test().test(n);
		}
	}
	
	public void test(int x) {
		int target = 25;
		if (x > target) {
			System.out.println("您输入的值比目标值大");
		} else if (x < target){
			System.out.println("您输入的值比目标值小");
		} else 
			System.out.println("bingo!!!!");
		
		
	}
}
