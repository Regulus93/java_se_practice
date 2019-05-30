public class ChapterFour {
	
	public static void main(String[] args) {

		Test t = new Test();
		Point p = t.getPoint();
		
		System.out.println("Value of p.a: " + p.getX() + " and p.b: " + p.getY());

		t.changeAttributes(3,3);
		
		System.out.println("Value of p.a: " + p.getX() + " and p.b: " + p.getY());
	}
	
}

class Test {
	
	private Point p;
	
	Test() {
		p = new Point();
	}
	
	public Point getPoint() {
		return p;
	}
	
	public void changeAttributes(int x, int y) {
		p.setData(x,y);
	}
	
}

class Point {
	
	private int x;
	private int y;
	
	// Commented because class fields are automatically initialized
	// public Point() {
		// x = 0;
		// y = 0;
	// }
	
	public void setData(int a, int b) {
		x = a;
		y = b;
	}
	
	public int getX() {
		//example for automatic type extend - if we cast x, the compiler won't warn about possible lossy conversion
		byte b = (byte) x;
		return b;
	}
	
	public int getY() {
		return y;
	}
}