package interfaces;

public interface Movable {
	void setX(double x);
	void setY(double y);
	double getX();
	double getY();
	default void move(double deltaX, double deltaY) {
		double newX = getX() + deltaX;
		double newY = getY() + deltaY;
		setX(newX);
		setY(newY);
	}
}
