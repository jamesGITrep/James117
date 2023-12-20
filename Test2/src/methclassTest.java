import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class methclassTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	
	@Test
	void testmultiply()
	{
		methclass objmult= new methclass();
		int expected = 8;
		int actual = objmult.mult(2,2,2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testdivide()
	{
	methclass objdiv = new methclass();
	int expected = 2;
	int actual = objdiv.div(10,5);
	assertEquals(expected, actual);
	}
}
