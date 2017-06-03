package thinking_chapter9;

public class FinallyWorks {
	static int count = 0;
	public static void main(String[] args) {
		while(true) {
			try {
				if(count++ == 0) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Exception thrown");
			} finally {
				System.out.println("in finally clause");
				if(count == 2) {
					break;
				}
			}
		}
	}
}
