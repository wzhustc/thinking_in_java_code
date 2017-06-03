package thinking_chapter8.excise;

import java.util.Hashtable;

public class Test3 {
    public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		for (int i = 0; i < ht.size(); i++) {
			ht.put(Integer.toString(i), Integer.toString(i));
			System.out.print(ht);
			System.out.println("------------");
		}
	}
}
