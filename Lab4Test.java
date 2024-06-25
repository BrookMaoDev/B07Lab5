package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab4Test {

	@Test
	void testDistance() {
		Point p = new Point(0, 0);
		Point p2 = new Point(0, 1);
		
		assertEquals(p.distance(p2), 1);
	}
	
	@Test
	void testHashCode() {
		Point p = new Point(9, 5);
		
		assertEquals(p.hashCode(), 52);
	}
	
	@Test
	void testPointEquals() {
		Point p = new Point (1, 0);
		Point p2 = p;
		
		assertTrue(p.equals(p2));
	}
	
	@Test
	void testPointEquals2() {
		Point p = new Point(1, 0);
		Point p2 = new Point(1, 0);
		
		assertTrue(p.equals(p2));
	}
	
	@Test
	void testPointEquals3() {
		Point p = new Point(1, 0);
		Point p2 = null;
		
		assertFalse(p.equals(p2));
	}
	
	@Test
	void testPointEquals4() {
		Point p = new Point(1, 0);
		Triangle t = new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));
		
		assertFalse(p.equals(t));
	}
	
	@Test
	void testPointEquals5() {
		Point p = new Point(1, 0);
		Point p2 = new Point(0, 1);
		
		assertFalse(p.equals(p2));
	}
	
	@Test
	void testPointEquals6() {
		Point p = new Point(1, 0);
		Point p2 = new Point(1, 1);
		
		assertFalse(p.equals(p2));
	}
	
	@Test
	void testPerimeter() {
		Triangle t = new Triangle(new Point(0, 0), new Point(0, 3), new Point(4, 0));
		
		assertEquals(t.perimeter(), 12);
	}
	
	@Test
	void testIsEquilateral() {
		Triangle t = new Triangle(new Point(0, 0), new Point(2, 2), new Point(1 - Math.sqrt(3), Math.sqrt(3) + 1));
		
		assertTrue(t.isEquilateral());
	}
	
	@Test
	void testIsEquilateral2() {
		Triangle t= new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));
		
		assertFalse(t.isEquilateral());
	}

}
