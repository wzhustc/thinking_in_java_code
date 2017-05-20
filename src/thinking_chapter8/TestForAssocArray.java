package thinking_chapter8;

public class TestForAssocArray {

	public static void main(String[] args) {
		AssocArray aa = new AssocArray();
		
		System.out.println(aa.isEmpty());
		
		System.out.println("-------------------");
		
		aa.put(1, 1);
		
		System.out.println(aa.isEmpty());
		
		System.out.println(aa.get(1));
		
		for (char c = 'a'; c <= 'z'; c++) {
			aa.put(String.valueOf(c), String.valueOf(c).toUpperCase());
		}
		char[] ca = {'a','i','o','u','e'};
		
		for (int i = 0; i < ca.length; i++) {
			System.out.println("UpperCase : " + aa.get(String.valueOf(ca[i])));
		}
		
	}
}
