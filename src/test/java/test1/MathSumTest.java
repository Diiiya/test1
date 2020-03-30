package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathSumTest {

	@Test
	public void testSum() {
		int expected = 10; 
		
		MathSum ms = new MathSum();
		int actual = ms.Sum(2, 8);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSum2() {
		int expected = 18; 
		
		MathSum ms = new MathSum();
		int actual = ms.Sum(2, 8);
		
		
		assertNotSame(expected, actual);
		
	}
	
	@Test
	public void testMultiply() {
		int expected = 12; 
		
		MathSum ms = new MathSum();
		int actual = ms.Multiply(2, 6);
		
		assertEquals(expected, actual);
		
	}

}
