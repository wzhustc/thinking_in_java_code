package thinking_chapter10_io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipCompress {
	public static void main(String[] args) throws IOException {
//		test1();
		test2();
	}
	
	public static void test1() throws IOException {
		// 输出流到zip文件
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("d:/test.zip"));
		// 实例化ZipEntry对象，存放Zip里面的文件
		ZipEntry entry = new ZipEntry("test.txt");
		zos.setComment("Zip 测试文件");
		zos.putNextEntry(entry);// 把生成的ZipEntry对象加入到压缩文件中
		// 输入流把test.txt文件输入到内存中
		InputStream is = new FileInputStream("d:/test.txt");
		int len = 0;
		// 读取输入流，输出(写出)到输出流中
		while ((len = is.read()) != -1) {
			zos.write(len);
		}
		is.close();
		zos.close();
	}
	
	public static void test2() throws IOException {
		File inFile = new File("d:/test.txt");
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(inFile));
		zos.setComment("多文件处理");
		zipFile(inFile, zos, "");
		zos.close();
	}
	
	// 文件压缩的方法
	public static void zipFile(File inFile, ZipOutputStream zos, String dir) throws IOException {
		if(inFile.isDirectory()) { // 如果inFile是文件夹的话，递归调用方法到最后一层
			File[] fileList = inFile.listFiles();
			for (File file : fileList) {
				zipFile(file, zos, dir);
			}
		} else { // 说明file是文件而不是文件夹
			String entryName = null;
			if(!"".equals(entryName)) {
				entryName = dir + entryName;
			} else {
				entryName = inFile.getName();
			}
			ZipEntry entry = new ZipEntry(entryName);
			zos.putNextEntry(entry);
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(inFile));
			byte[] data = new byte[1024];
			int len = 0;
			while ((len = is.read(data)) != -1) {
				zos.write(data);
			}
			is.close();
		}
	}
	
}
