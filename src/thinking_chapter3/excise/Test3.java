package thinking_chapter3.excise;

/**
 * 
 * 本程序说明switch中如果有break的话就会跳出case，如果没有的话，会一路执行下去，直到遇到break再跳出case。
 * @author v_zhangwei13
 * Create on 2017年4月30日下午7:35:28
 */
public class Test3 {
	public static void main(String[] args) {
		for (int i = 0; i <= 11; i++) {
			switch(i) {
			case 1:
				System.out.println("1楼到了");
				break;
			case 2:
				System.out.println("2楼到了");
				break;
			case 3:
				System.out.println("3楼到了");
				break;
			case 4:
				System.out.println("4楼到了");
				break;
			case 5:
				System.out.println("5楼到了");
				break;
			case 6:
				System.out.println("6楼到了");
				break;
			case 7:
				System.out.println("7楼到了");
				break;
			case 8:
				System.out.println("8楼到了");
				break;
			case 9:
				System.out.println("9楼到了");
				break;
			case 10:
				System.out.println("10楼到了");
				break;
			default:
				System.out.println("你想上天啊！");
			}	
		}
		
	}
}
