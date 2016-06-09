package effective_android_test;


import junit.framework.TestCase;


public class RectangleTest extends TestCase {

	LspTest lspTest;

	@Override
	protected void setUp() throws Exception {

		super.setUp();
		lspTest = new LspTest();
	}

	public void testName() throws Exception {

		lspTest.main();
	}

}