package interfaces;

public class Pen implements Movable {
	private double x;
	private double y;

	public Pen() {
		
	}

	public Pen(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void setX(double x) {
		this.x = x;
	}

	@Override
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Pen [x=" + x + ", y=" + y + "]";
	}

}
