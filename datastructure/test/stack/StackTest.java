package stack;


import junit.framework.TestCase;


/**
 * int 만 들어가는 배열로 만든 스택
 */
public class StackTest extends TestCase {

	private Stack stack;

	public void setUp() throws Exception {

		super.setUp();
		stack = new Stack( 100 );
	}

	public void testGetStackTopIndex() throws Exception {

		assertEquals( -1, stack.getStackTopIndex() );
		assertEquals( 0, stack.getSize() );
	}

	public void testPush() throws Exception {

		assertFalse( stack.push( null ) );

		assertTrue( stack.push( 3 ) );
		assertEquals( 0, stack.getStackTopIndex() );
		assertEquals( 1, stack.getSize() );

		assertTrue( stack.push( 4 ) );
		assertTrue( stack.push( 5 ) );
		assertEquals( 2, stack.getStackTopIndex() );
		assertEquals( 3, stack.getSize() );
	}

	public void testPop() throws Exception {

		stack.push( 4 );
		stack.push( 5 );

		assertEquals( 1, stack.getStackTopIndex() );
		assertEquals( 2, stack.getSize() );

		assertEquals( 5, stack.pop().intValue() );
		assertEquals( 0, stack.getStackTopIndex() );
		assertEquals( 1, stack.getSize() );

		assertEquals( 4, stack.pop().intValue() );
		assertEquals( -1, stack.getStackTopIndex() );
		assertEquals( 0, stack.getSize() );
	}

	public void testIsEmpty() throws Exception {

		assertTrue( stack.isEmpty() );

		stack.push( 4 );
		assertFalse( stack.isEmpty() );
	}

}