package thinking_chapter10_io;

import java.io.File;
import java.io.FilenameFilter;

public class DirList2 {
	public static void main(String[] args) {
		File file = new File("/");
		String[] list = null;
		if (args.length == 0) {
			list = file.list();
		} else {
			list = file.list(filter(args[0]));
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
//	注意filter()的自变量必须是final。这一点是匿名内部类要求的，使其能使用来自本身作用域以外的一个对象
	public static FilenameFilter filter(final String afn) {
		return new FilenameFilter() {

			String fn = afn;
			
			@Override
			public boolean accept(File dir, String name) {
				String f = new File(name).getName();
				return f.indexOf(fn) != -1;
			}
			
		};
	}
}
