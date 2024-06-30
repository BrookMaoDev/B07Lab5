package b07lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestParallelogram {

	@Test
	void testParallelogram() {
		Point ul = new Point(0,0);
		Point br = new Point(4,4);
		double len1 = 4.0;
		double len2 = 6.0;
		Parallelogram p1 = new Parallelogram(ul, br, len1);
		Parallelogram p2 = new Parallelogram(br, ul, len2);
		assertNotNull(p1);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testArea1() {
		Point ul = new Point(2,2);
		Point br = new Point(6,6);
		double len = 5.0;
		Parallelogram p1 = new Parallelogram(ul, br, len);
		assertEquals(p1.area(),20.0);
	}
	
	@Test
	void testArea2() {
		Point ul = new Point(1,1);
		Point br = new Point(5,5);
		double len = 10.0;
		Parallelogram p1 = new Parallelogram(ul, br, len);
		assertEquals(p1.area(),40.0);
	}
	
	@Test
	void testPerimeter2() {
		Point ul = new Point(0,0);
		Point br = new Point(2,3);
		double len = 6.0;
		Parallelogram p1 = new Parallelogram(ul, br, len);
		assertEquals(p1.perimeter(),22);
	}
	
	@Test
	void testGetUpperRight() {
		Point ul = new Point(0,0);
		Point br = new Point(4,-4);
		double len = 6.0;
		Parallelogram p1 = new Parallelogram(ul, br, len);
		Point ur = new Point (6,0);
		assertEquals(p1.getUpperRight(), ur);
	}
	
	@Test
	void testGetBottomLeft() {
		Point ul = new Point(0,0);
		Point br = new Point(4,-4);
		double len = 6.0;
		Parallelogram p1 = new Parallelogram(ul, br, len);
		Point bl = new Point (-2,-4);
		assertEquals(p1.getBottomLeft(), bl);
	}
	
	@Test
	void testPerimeter1() {
		Point ul = new Point(0,0);
		Point br = new Point(4,-4);
		double len = 6.0;
		Parallelogram p1 = new Parallelogram(ul, br, len);
		assertEquals(p1.perimeter(),12 + 4*Math.sqrt(5));
	}
	
	@Test
	void testHashCode() {
		Point ul = new Point(0,0);
		Point br = new Point(1,1);
		double len = 4.0;
		Parallelogram p1 = new Parallelogram(ul, br, len);
		assertEquals(p1.hashCode(), 68);
	}
	
	@Test
	void testEquals1() {
		Point ul = new Point(0,0);
		Point br = new Point(1,1);
		double len = 4.0;
		Parallelogram p1 = new Parallelogram(ul, br, len);
		assertTrue(p1.equals(p1));
	}
	
	@Test
	void testEquals2() {
		Point ul1 = new Point(0,0);
		Point br1 = new Point(1,1);
		double len1 = 4.0;
		Parallelogram p1 = new Parallelogram(ul1, br1, len1);
		Point ul2 = new Point(1,1);
		Point br2 = new Point(2,2);
		double len2 = 5.0;
		Parallelogram p2 = new Parallelogram(ul2, br2, len2);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testEquals3() {
		Point ul1 = new Point(0,0);
		Point br1 = new Point(1,1);
		double len1 = 4.0;
		Parallelogram p1 = new Parallelogram(ul1, br1, len1);
		Point ul2 = new Point(1,1);
		Point br2 = new Point(2,2);
		double len2 = 5.0;
		Parallelogram p2 = new Parallelogram(ul2, br2, len2);
		p2 = null;
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testEquals4() {
		Point ul1 = new Point(0,0);
		Point br1 = new Point(1,1);
		double len1 = 4.0;
		Parallelogram p1 = new Parallelogram(ul1, br1, len1);
		Point p2 = new Point(1,2);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testEquals5() {
		Point ul1 = new Point(0,0);
		Point br1 = new Point(1,1);
		double len1 = 4.0;
		Parallelogram p1 = new Parallelogram(ul1, br1, len1);
		Point ul2 = new Point(0,0);
		Point br2 = new Point(1,1);
		double len2 = 4.0;
		Parallelogram p2 = new Parallelogram(ul2, br2, len2);
		assertTrue(p1.equals(p2));
	}
	
	@Test
	void testEquals6() {
		Point ul1 = new Point(0,0);
		Point br1 = new Point(1,1);
		double len1 = 4.0;
		Parallelogram p1 = new Parallelogram(ul1, br1, len1);
		Point ul2 = new Point(0,0);
		Point br2 = new Point(2,2);
		double len2 = 4.0;
		Parallelogram p2 = new Parallelogram(ul2, br2, len2);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void testEquals7() {
		Point ul1 = new Point(0,0);
		Point br1 = new Point(1,1);
		double len1 = 4.0;
		Parallelogram p1 = new Parallelogram(ul1, br1, len1);
		Point ul2 = new Point(0,0);
		Point br2 = new Point(1,1);
		double len2 = 5.0;
		Parallelogram p2 = new Parallelogram(ul2, br2, len2);
		assertFalse(p1.equals(p2));
	}
	

}
