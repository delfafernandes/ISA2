package Assign__;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Dogtest {

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
		dog dog = new dog("Bella", "Poodle");
        assertEquals("Bella", dog.getName());
        assertEquals("Poodle", dog.getbreed());

        // Modify attributes using setter methods
        dog.setName("Luna");
        dog.setbreed("Labrador");
        assertEquals("Luna", dog.getName());
        assertEquals("Labrador", dog.getbreed());
	}

}
