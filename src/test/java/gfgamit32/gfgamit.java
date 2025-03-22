package gfgamit32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class gfgamit {
	
	Calculator calc=new Calculator();

	@Test
	public void test_sum() {
		assertEquals(30,calc.sum(20, 10));
		assertEquals(11,calc.sum(1, 10));
		assertEquals(0,calc.sum(-1, 1));
		
	}
	public void test_diff() {
		assertEquals(10,calc.diff(20, 10));
		assertEquals(5,calc.diff(10, 5));
		assertEquals(-2,calc.diff(-1, 1));
		
	}

}
