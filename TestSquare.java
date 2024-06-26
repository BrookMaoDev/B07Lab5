package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSquare {

	// Square Class
	// perimeter() method
	
	@Test
	void testGeneralPerimeter() {
		Point p = new Point(3, 4);
		Square s1 = new Square(p, 5);
		assertEquals(s1.perimeter(), 20);
	}
	
	@Test
	void testZeroPerimeter() {
		Point p = new Point(1, 8);
		Square s1 = new Square(p, 0);
		assertEquals(s1.perimeter(), 0);
	}
	
	// area() method
	
	@Test
	void testGeneralArea() {
		Point p = new Point(5, 6);
		Square s1 = new Square(p, 15);
		assertEquals(s1.area(), 225);
	}
	
	@Test
	void testZeroArea() {
		Point p = new Point(5, 6);
		Square s1 = new Square(p, 0);
		assertEquals(s1.area(), 0);
	}
	
	// hashCode() method
	
	@Test
	void testEqualHashCode() {
		Point p1 = new Point(5, 7);
		Square s1 = new Square(p1, 10);
		Point p2 = new Point(5, 7);
		Square s2 = new Square(p2, 10);
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	// equals() method
	
	@Test
	void testEquivalentSquareEquals() {
		Point p1 = new Point(5, 7);
		Square s1 = new Square(p1, 10);
		Point p2 = new Point(5, 7);
		Square s2 = new Square(p2, 10);
		assertTrue(s1.equals(s2));
	}
	
	@Test
	void testDiffLengthEquals() {
		Point p1 = new Point(5, 7);
		Square s1 = new Square(p1, 10);
		Point p2 = new Point(5, 7);
		Square s2 = new Square(p2, 17);
		assertFalse(s1.equals(s2));
	}
	
	@Test
	void testDiffPointEquals() {
		Point p1 = new Point(-5, -7);
		Square s1 = new Square(p1, 10);
		Point p2 = new Point(5, 7);
		Square s2 = new Square(p2, 10);
		assertFalse(s1.equals(s2));
	}
	
	
	@Test
	void testDiffSquareEquals() {
		Point p1 = new Point(-5, -7);
		Square s1 = new Square(p1, 5);
		Point p2 = new Point(5, 17);
		Square s2 = new Square(p2, 10);
		assertFalse(s1.equals(s2));
	}
	
	
	@Test
	void testPointSquareEquals() {
		Point p1 = new Point(-5, -7);
		Square s1 = new Square(p1, 5);
		Point p2 = new Point(5, 17);
		assertFalse(s1.equals(p2));
	}
	
	@Test
	void testSquareNullEquals() {
		Point p1 = new Point(-5, -7);
		Square s1 = new Square(p1, 5);
		assertFalse(s1.equals(null));
	}
	
	@Test
	void testSameSquareEquals1() {
		Point p1 = new Point(-5, -7);
		Square s1 = new Square(p1, 5);
		assertTrue(s1.equals(s1));
	}

}
