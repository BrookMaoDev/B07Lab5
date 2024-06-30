package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCircle {

	@Test
	void testCircle() {
        Point center = new Point(1, 1);
        double rad = 1;
		Circle c = new Circle(center, rad);
        assertNotNull(c);
	}

	@Test
	void testComputeArea() {
		Circle c = new Circle(new Point(0, 0), 1);
        assertEquals(c.computeArea(), Math.PI);
	}

	@Test
	void testComputeAreaZero() {
		Circle c = new Circle(new Point(0, 0), 0);
        assertEquals(c.computeArea(), 0);
	}

	@Test
	void testGetCircumference() {
		Circle c = new Circle(new Point(0, 0), 1);
        assertEquals(c.getCircumference(), 2 * Math.PI);
	}

	@Test
	void testGetCircumferenceZero() {
		Circle c = new Circle(new Point(0, 0), 0);
        assertEquals(c.getCircumference(), 0);
	}

	@Test
	void testWithinCircle() {
		Circle c = new Circle(new Point(0, 0), 1);
        Point p = new Point(0.5, 0.5);
        assertTrue(c.withinCircle(p));
	}

	@Test
	void testNotWithinCircle() {
		Circle c = new Circle(new Point(0, 0), 1);
        Point p = new Point(2, 0);
        assertFalse(c.withinCircle(p));
	}

	@Test
	void testIntersects() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(1, 0), 1);
        assertTrue(a.intersects(b));
	}

	@Test
	void testIntersectsTangent() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(2, 0), 1);
        assertTrue(a.intersects(b));
	}

	@Test
	void testNotIntersects() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(3, 0), 1);
        assertFalse(a.intersects(b));
	}

	@Test
	void testIsInside() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(0, 0), 2);
        assertTrue(a.isInside(b));
	}

	@Test
	void testIsNotInside() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(0, 0), 2);
        assertFalse(b.isInside(a));
	}

	@Test
	void testContains() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(0, 0), 2);
        assertTrue(b.contains(a));
	}

	@Test
	void testNotContains() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(0, 0), 2);
        assertFalse(a.contains(b));
	}

	@Test
	void testIsInscribed() {
		Circle c = new Circle(new Point(0, 0), 1);
        Triangle t = new Triangle(
            new Point(-1, 0),
            new Point(0, 1),
            new Point(1, 0)
        );
        assertTrue(c.isInscribed(t));
	}

	@Test
	void testIsNotInscribedPointA() {
		Circle c = new Circle(new Point(0, 0), 1);
        Triangle t = new Triangle(
            new Point(0, 0),
            new Point(0, 1),
            new Point(1, 0)
        );
        assertFalse(c.isInscribed(t));
	}

	@Test
	void testIsNotInscribedPointB() {
		Circle c = new Circle(new Point(0, 0), 1);
        Triangle t = new Triangle(
            new Point(-1, 0),
            new Point(0, 0),
            new Point(1, 0)
        );
        assertFalse(c.isInscribed(t));
	}

	@Test
	void testIsNotInscribedPointC() {
		Circle c = new Circle(new Point(0, 0), 1);
        Triangle t = new Triangle(
            new Point(-1, 0),
            new Point(0, 1),
            new Point(0, 0)
        );
        assertFalse(c.isInscribed(t));
	}

	@Test
	void testHashCodeSameCircle() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(0, 0), 1);
        assertEquals(a.hashCode(), b.hashCode());
	}

	@Test
	void testEqualsSelf() {
		Circle c = new Circle(new Point(0, 0), 1);
        assertEquals(c, c);
	}

	@Test
	void testNotEqualsNull() {
		Circle c = new Circle(new Point(0, 0), 1);
        assertNotEquals(c, null);
	}

	@Test
	void testNotEqualsNotCircle() {
		Circle c = new Circle(new Point(0, 0), 1);
        assertNotEquals(c, new int[0]);
	}

	@Test
	void testNotEqualsDistinctCenter() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(1, 0), 1);
        assertNotEquals(a, b);
	}

	@Test
	void testNotEqualsDistinctRadius() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(0, 0), 2);
        assertNotEquals(a, b);
	}

	@Test
	void testSameCircle() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(0, 0), 1);
        assertEquals(a, b);
	}

	@Test
	void testDistance() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(1, 0), 1);
        assertEquals(a.distance(b), 1);
	}

	@Test
	void testDistanceZero() {
		Circle  a = new Circle(new Point(0, 0), 1),
                b = new Circle(new Point(0, 0), 1);
        assertEquals(a.distance(b), 0);
	}

	@Test
	void testGetRadius() {
		Circle c = new Circle(new Point(0, 0), 1);
        assertEquals(c.getRadius(), 1);
	}

	@Test
	void testGetCenter() {
		Circle c = new Circle(new Point(0, 0), 1);
        assertEquals(c.getCenter(), new Point(0, 0));
	}

	@Test
	void testSetRadius() {
		Circle c = new Circle(new Point(0, 0), 1);
        c.setRadius(2);
        // We have tested .getRadius()
        assertEquals(c.getRadius(), 2);
	}

}
