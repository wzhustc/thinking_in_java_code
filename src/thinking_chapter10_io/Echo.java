package thinking_chapter10_io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * 
 * @author v_zhangwei13
 * Create on 2017年6月10日下午5:16:22
 */
public class Echo {
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(new BufferedInputStream(System.in));
		
		String s = null;
		System.out.println("enter name: ");
		
		s = dis.readLine();
		System.out.println("name is : " + s);
	}
}