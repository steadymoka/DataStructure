package effective_android_test;


class Rectangle {

	protected int m_width;
	protected int m_height;

	public void setWidth( int width ) {

		m_width = width;
	}

	public void setHeight( int height ) {

		m_height = height;
	}

	public int getWidth() {

		return m_width;
	}

	public int getHeight() {

		return m_height;
	}

	public int getArea() {

		return m_width * m_height;
	}
}

class Square extends Rectangle {

	public void setWidth( int width ) {

		m_width = width;
		m_height = width;
	}

	public void setHeight( int height ) {

		m_width = height;
		m_height = height;
	}

}

class LspTest {

	private static Rectangle getNewRectangle() {
		// it can be an object returned by some factory ...
		return new Square();
	}

	public static void main() {

		Rectangle r = LspTest.getNewRectangle();

		r.setWidth( 5 );
		r.setHeight( 10 );
		// user knows that r it's a rectangle.
		// It assumes that he's able to set the width and height as for the base class

		System.out.println( r.getArea() );
		// now he's surprised to see that the area is 100 instead of 50.
	}

}