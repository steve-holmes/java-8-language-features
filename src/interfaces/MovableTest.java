package interfaces;

public class MovableTest {
	public static void main(String[] args) {
		Movable p1 = new Pen();
		System.out.println(p1);
		
		p1.setX(10.0);
		p1.setY(5.0);
		System.out.println(p1);
		
		p1.move(5.0, 2.0);
		System.out.println(p1);
	}
}
