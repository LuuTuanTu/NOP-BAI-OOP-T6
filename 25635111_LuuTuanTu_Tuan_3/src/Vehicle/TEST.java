package Vehicle;

public class TEST {

	public static void main(String[] args) {
		XE xe1 = new XE("Nguyen Van A", "A", 200, 500000);
		XE xe2 = new XE("Nguyen Van B", "B",  80, 460000);
		XE xe3 = new XE("Nguyen Van C", "C", 500, 200000);
		
		System.out.printf(xe1.toString());
		System.out.printf("\n");
		System.out.printf(xe2.toString());
		System.out.printf("\n");
		System.out.printf(xe3.toString());
		
		

	}

}
