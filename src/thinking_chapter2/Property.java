package thinking_chapter2;

import java.util.Date;
import java.util.Properties;

public class Property {
	public static void main(String[] args) {
		System.out.println(new Date());
		
		Properties p = System.getProperties();
		p.list(System.out);// 把属性p的所有内容都发给作为自变量传递的PrintStream对象
		System.out.println("----------Memory Use:");
		Runtime rt = Runtime.getRuntime();
		// 编译器将rt.totalMemory()、rt.freeMemory()的返回值转换成字符串
		System.out.println("Total memory = " + rt.totalMemory() + " Free momery : " + rt.freeMemory());
	}
}
