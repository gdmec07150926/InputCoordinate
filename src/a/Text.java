package a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Text {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsPoint() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isPoint());
	}

	@Test
	public void testIsSegment() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isSegment());
	}

	@Test
	public void testIsTriangle() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isTriangle());
	}

	@Test
	public void testIsEquilateral() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isEquilateral());
	}

	@Test
	public void testIsIsosceles() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isIsosceles());
	}

	@Test
	public void testIsRightAngled() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isRightAngled());
	}

	@Test
	public void testIsQuadrilateral() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isQuadrilateral());
	}

	@Test
	public void testIsConcave() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isConcave());
	}

	@Test
	public void testIsComplex() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isComplex());
	}

	@Test
	public void testIsConvex() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isConvex());
	}

	@Test
	public void testIsTrapezium() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isTrapezium());
	}

	@Test
	public void testIsIsoscelesTrapezium() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isIsoscelesTrapezium());
	}

	@Test
	public void testIsRightAngledTrapezium() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isRightAngledTrapezium());
	}

	@Test
	public void testIsParallelogram() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isParallelogram());
	}

	@Test
	public void testIsRectangle() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isRectangle());
	}

	@Test
	public void testIsRhombusORisSquare() {
		A a = new A(0,0,2,0,1,1,0,0);
		assertEquals(true,a.isRhombusORisSquare());
	}

	@Test
	public void testCalculate() {
		A a = new A(0,0,2,0,0,2,0,0);
		assertEquals("等腰等腰三角形",a.calculate());
	}

}
