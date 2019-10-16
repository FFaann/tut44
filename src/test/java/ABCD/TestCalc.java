package ABCD;

import static org.junit.jupiter.api.Assertions.assertTrue;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestCalc 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestCalc( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCalc.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

	public void testAdd() {
		int a=2;
		int b=1;
		int sum=a+b;
		assertTrue(sum==3);
	}
	public void testSubtract() {
		int a=2;
		int b=1;
		int sum=a+b;
		assertTrue(sum==1);
	}
}
