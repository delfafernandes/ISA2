package Assign__;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountNo_DigitsTest {

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
	public void testtestCountDigits() {
        assertEquals(1, CountNo_Digits.countDigits(0));
        assertEquals(1, CountNo_Digits.countDigits(5));
        assertEquals(2, CountNo_Digits.countDigits(25));
        assertEquals(3, CountNo_Digits.countDigits(987));
        assertEquals(4, CountNo_Digits.countDigits(6789));
        assertEquals(5, CountNo_Digits.countDigits(12345));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(3, CountNo_Digits.countDigits(-4));
        assertEquals(3, CountNo_Digits.countDigits(-5));
	}

}
