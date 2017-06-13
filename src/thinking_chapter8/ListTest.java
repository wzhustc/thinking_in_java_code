package thinking_chapter8;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
//		list.add(new String("abc"));
		System.out.println(list);
		if (list.size() == 0) {
			System.out.println("List is empty, add something to it");
		} else 
			System.out.println("List have element");
		
	}
}
