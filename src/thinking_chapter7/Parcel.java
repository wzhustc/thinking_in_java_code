package thinking_chapter7;

public class Parcel {
	class Contents {
		
		private int i = 11;
		
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		
		 public Destination(String whereTo) {
			 label = whereTo;
		 }
	}
	
	public void ship(String dest) {
		new Contents();
		new Destination(dest);
	}
	
	public static void main(String[] args) {
		Parcel p = new Parcel();
		p.ship("Beijing");
	}
}
