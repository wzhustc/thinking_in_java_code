package thinking_chapter10_io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(new FileInputStream("d:/test.txt")));
		while (dis.available() != 0) {
			System.out.print((char)dis.readByte());
		}
	}
}
