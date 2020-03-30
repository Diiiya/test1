package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathSumTest {

	@Test
	public void test() {
		int expected = 10; 
		
		MathSum ms = new MathSum();
		int actual = ms.Sum(2, 8);
		
		assertEquals(expected, actual);
		
	}

}
