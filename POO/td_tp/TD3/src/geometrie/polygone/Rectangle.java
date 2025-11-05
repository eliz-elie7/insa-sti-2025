package geometrie.polygone;

import geometrie.Point;

public class Rectangle extends Quadrilateral {
	
	public Rectangle() {
		System.out.println("Rectangle constructor");
	}
	
	public Rectangle(Point p1, Point p3) {
		super(p1, new Point(p1.getX(),p3.getY()), p3, new Point(p3.getX(), p1.getX()));
		System.out.println("Rectangle constructor");
	}
	
	/**
	 * Computes the perimeter of a rectangle leveraging equality of length between segments
	 * @return  Returns the perimeter.
	 */
	@Override
	public double getPerimeter() {
		double perimeter = 0;
		perimeter = this.getTheSegments()[0].length()*2 + this.getTheSegments()[2].length()*2;
		return perimeter;
	}
	
	public void draw() {
		System.out.println("Drawing a rectangle");
	}

	public int code = 2;
}
