import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
			int a = 4321;
			int b = 1234;
				
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 
				 
			int expected = 5555;
			assertEquals (expected, actual);
			}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	@Test
	public void testDivide() {
		int a = 44440000;
		int b = 8000;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 5555;
		assertEquals (actual, expected);
		}
	@Test
	public void testMultiply() {
		int a = 91;
		int b = 61;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 5551;
		assertEquals (actual, expected);
		}
	

}
