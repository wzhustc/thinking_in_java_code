package thinking_chapter10_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.StringBufferInputStream;

/**
 * Created by v_zhangwei13 on 2017/6/5.
 */
public class IOStreamDemo {
    public static void main(String[] args) throws IOException {
        // 输入流 从文件中读取到内存中
		DataInputStream dataInputStream = new DataInputStream(
		    new BufferedInputStream(new FileInputStream("D:/test.txt")));
		String s, s2 = new String();
		while((s = dataInputStream.readLine()) != null) {
			s2 += s + "\n";
		}
		dataInputStream.close();
		System.out.println(s2);
		
        // 包装流是DataInputStream
        DataInputStream dis = new DataInputStream(
        		new BufferedInputStream(new FileInputStream("d:/test.txt")));
        byte[] b = new byte[1024];
        int len = dis.read(b);
        System.out.println(new String(b,0,len));
        dis.close();
        
        // 包装流是StringBufferInputStream
        StringBufferInputStream sbis = new StringBufferInputStream(s2);
        int c;
        while ((c = sbis.read()) != -1) {
        	System.out.print((char)c);
        }
        sbis.close();
        
//        DataInputStream in = new DataInputStream(
//        		new BufferedInputStream(new FileInputStream("d:/TestShellT.java")));
//        int i;
//        while ((i = in.read()) != -1) {
//        	System.out.print((char)i);
//        }
//        in.close();
//       System.out.println("-----------------------------");
       
		try {
			LineNumberInputStream li = new LineNumberInputStream(
					new StringBufferInputStream(s2));
			DataInputStream in4 = new DataInputStream(li);
			PrintStream out1 = new PrintStream(new BufferedOutputStream(
					new FileOutputStream("IODemo.out")));
			while ((s = in4.readLine()) != null)
				out1.println("Line " + li.getLineNumber() + s);
			out1.close(); // finalize() not reliable!
		} catch (EOFException e) {
			System.out.println("End of stream encountered");
		}
		
		
		// 下面的是输出流部分
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("d:/data.txt")));
		dos.writeBytes("hahahaha");
		dos.writeByte(111);
		dos.close();
		System.out.println("========================");
		// Reading/writing random access files
		RandomAccessFile rf = new RandomAccessFile("d:/test1.txt", "rw");
		
		rf.writeBytes("hello,everyone,Welcome to java world");
		
		byte[] bb = new byte[1024];
		int ii;
		while ((ii = rf.read(bb)) != -1) {
			System.out.println((char)ii);
		}
		rf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
    }

}
