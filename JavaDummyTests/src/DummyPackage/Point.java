package DummyPackage;

import java.awt.Color;

public interface Point {
	double getX();

	double getY();
}

final class CartesianPoint implements Point {

	private final double _x;
	private final double _y;
	private final Color _color;

	public CartesianPoint(double x, double y, Color color) {
		_x = x;
		_y = y;
		_color = color;

	}

	@Override
	public double getX() {
		return _x;
	}

	@Override
	public double getY() {
		return _y;
	}

	public Color getColor() {
		System.out.println("its cartesian point !");
		return _color;
	}
}

final class PolarPoint implements Point {

	private final double _theta;
	private final double _r;
	private final Color _color;

	public PolarPoint(double theta, double r, Color color) {
		_theta = theta;
		_r = r;
		_color = color;
	}

	public double getX() {
		return _r * Math.cos(_theta);
	}

	public double getY() {
		return _r * Math.sin(_theta);
	}

	public Color getColor() {
		System.out.println("It's Polar!");
		return _color;
	}

}
