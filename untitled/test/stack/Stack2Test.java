package stack;


import junit.framework.TestCase;


public class Stack2Test extends TestCase {

	private Stack2 stack;

	public void setUp() throws Exception {

		super.setUp();
		stack = new Stack2();
	}

	public void testGetSize() throws Exception {

		assertEquals( 0, stack.getSize() );
	}

	public void testPush() throws Exception {

		assertFalse( stack.push( null ) );

		assertTrue( stack.push( 3 ) );
		assertEquals( 1, stack.getSize() );

		assertTrue( stack.push( 4 ) );
		assertTrue( stack.push( 5 ) );
		assertEquals( 3, stack.getSize() );
	}

	public void testPop() throws Exception {

		stack.push( 4 );
		stack.push( 5 );

		assertEquals( 2, stack.getSize() );

		assertEquals( 5, stack.pop() );
		assertEquals( 1, stack.getSize() );

		assertEquals( 4, stack.pop() );
		assertEquals( 0, stack.getSize() );
	}

	public void testIsEmpty() throws Exception {

		assertTrue( stack.isEmpty() );

		stack.push( 4 );
		assertFalse( stack.isEmpty() );
	}

}