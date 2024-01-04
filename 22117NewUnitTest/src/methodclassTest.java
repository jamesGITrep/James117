import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class methodclassTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testaddition()
	{
	methodclass objadding = new methodclass();
	int expected = 10;
	int actual = objadding.adding(5,5);
	assertEquals (expected, actual);
	}
	
	@Test
	void testmultiply()
	{
	methodclass objmult= new methodclass();
	int expected = 8;
	int actual = objmult.mult (2,2, 2);
	assertEquals (expected, actual);
	}
	
	
	@Test
	void testdivide()
	{
	methodclass objdiv = new methodclass();
	int expected = 2;
	int actual = objdiv.div(10,5);
	assertEquals(expected, actual);
	
	
	
	}
}
	
	

