import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTests {

	@Test
	void test1() {
		int c = Calculators.Addition(2,3);
        assertEquals("Addition of 2,3 is", 5, c);  
	}
	
	@Test
	void test2() {
		int c = Calculators.Subtraction(2,3);
        assertEquals("Addition of 2,3 is", -1, c);  
	}
	@Test
	void test3() {
		int c = Calculators.Multiplication(2,3);
        assertEquals("Addition of 2,3 is", 6, c);  
	}
	@Test
	void test4() {
		int c = Calculators.Division(2,3);
        assertEquals("Addition of 2,3 is", 0, c);  
	}
}
