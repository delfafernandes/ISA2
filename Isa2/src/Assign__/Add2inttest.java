package Assign__;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Add2inttest {

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
	public void test() {
		//prepare 
		int first =6;
		int second =16;
		
		//execute
		int sum =first + second ;
		
		//verify
		assertEquals(22, sum);
		}
	@Test 
	public void negativetest() {
		//prepare 
				int first =-4;
				int second =-16;
				
				//execute
				int sum =first + second ;
				
				//verify
				assertEquals(-22, sum);

	}

}
