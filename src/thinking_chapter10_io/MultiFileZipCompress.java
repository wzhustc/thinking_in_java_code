package thinking_chapter10_io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class MultiFileZipCompress {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(
				new File("d:/test/test.zip"));

		CheckedOutputStream csum = new CheckedOutputStream(fos, new Adler32());
		ZipOutputStream out = new ZipOutputStream(csum);
		out.setComment("test for multi File zip");
		for (int i = 0; i < args.length; i++) {
			System.out.println("Writing file " + args[i]);
			BufferedReader in = new BufferedReader(new FileReader(args[i]));
			out.putNextEntry(new ZipEntry(args[i]));
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			in.close();
		}
		out.close();
		System.out.println("Checksum: " + csum.getChecksum().getValue());
		// Now extract the files:
		System.out.println("Reading file");
		FileInputStream fi = new FileInputStream("test.zip");
		CheckedInputStream csumi = new CheckedInputStream(fi, new Adler32());
		ZipInputStream in2 = new ZipInputStream(new BufferedInputStream(csumi));
		ZipEntry ze;
		System.out.println("Checksum: " + csumi.getChecksum().getValue());
		while ((ze = in2.getNextEntry()) != null) {
			System.out.println("Reading file " + ze);
			int x;
			while ((x = in2.read()) != -1)
				System.out.write(x);
		}
		in2.close();
		// Alternative way to open and read
		// zip files:
		ZipFile zf = new ZipFile("test.zip");
		Enumeration e = zf.entries();
		while (e.hasMoreElements()) {
			ZipEntry ze2 = (ZipEntry) e.nextElement();
			System.out.println("File: " + ze2);
			// ... and extract the data as before
		}
	}

}
