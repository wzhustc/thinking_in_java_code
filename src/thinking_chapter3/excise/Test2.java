package thinking_chapter3.excise;

/**
 * 
 * 本程序修改Test1在47时候跳出循环
 * @author v_zhangwei13
 * Create on 2017年4月30日下午6:17:06
 */
public class Test2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i == 47) {
				break;
			} else 
				System.out.println(i);
		}
	}
}
