package thinking_chapter10_io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class DirList {
	
	public static void main(String[] args) throws Exception {
		File file = new File("."); //'.' 代表当前目录，'/'代表当前根目录
		String[] list;
		if (args.length == 0) {
			list = file.list();
			
		} else {
			list = file.list(new DirFilter(args[0]));
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println("---------------------------");
		System.out.println(file.getCanonicalPath());
	}
}

class DirFilter implements FilenameFilter {

	String afn;
	
	public DirFilter(String afn) {
		this.afn = afn;
	}
	
	@Override
	public boolean accept(File dir, String name) {
//		accept()方法必须接纳一个File对象，用它指示用于寻找一个特定文件的目录；并接纳一个
//		String，其中包含了要寻找之文件的名字。可决定使用或忽略这两个参数之一，但有时至少要
//		使用文件名
		String f = new File(name).getName(); //作用是去除所有路径信息
		
//		accept()用String类的indexOf()方法检查文件名内部是否存在搜索字串"afn"。若在字串内找到afn，那么
//		返回值就是afn的起点索引；但假如没有找到，返回值就是-1
		return f.indexOf(afn) != -1;
	}
	
}