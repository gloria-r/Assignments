package com.lavenberg.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.lavenberg.Line;

public class LineTest {
	
	// Test Constructors
	
	Line l1 = new Line(3.0, 5.0, 4.0, 2.0);
	Line l2 = new Line(2.0, 4.0, 3.0, 1.0);
	Line l3 = new Line(1.0, 1.0, 4.0, 3.0);
	Line l4 = new Line(3.0, 1.0, 5.0, 4.0);
	Line l5 = new Line(3.0, 1.0, 5.0, 4.0);

	
	@Test
	public void getSlopeTest() {	
		assertEquals(l1.getSlope(), 3.0, 5.0);
		assertEquals(l2.getSlope(), 2.0, 4.0);
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals(l1.getDistance(), 3.0, 5.0);
	}
	
	@Test
	public void parallelToTest() {	   
        assertFalse(l3.parallelTo(l4));	
        assertTrue(l4.parallelTo(l5));	
	}
}
