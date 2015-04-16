package list;


import junit.framework.TestCase;


public class LinkedListTest extends TestCase {

	private LinkedList linkedList;

	public void setUp() throws Exception {

		super.setUp();
		linkedList = new LinkedList();
	}

	public void testInit() throws Exception {

		assertEquals( 0, linkedList.init() );
	}

	public void testIsEmpty() throws Exception {

		linkedList.init();
		assertTrue( linkedList.isEmpty() );
	}

	public void testAddFist() throws Exception {

		assertNotNull( linkedList.addFirst( 5 ) );
	}

	public void testFind() throws Exception {

		linkedList.addFirst( 1 );
		linkedList.addFirst( 2 );

		assertEquals( 2, linkedList.node( 0 ).getData() );
		assertEquals( 1, linkedList.node( 1 ).getData() );

		assertNull( linkedList.node( 2 ) );
	}

	public void testAdd() throws Exception {

		linkedList.add( 0, 5 );
		assertEquals( 5, linkedList.node( 0 ).getData() );

		linkedList.add( 1, 5 );
		linkedList.add( 2, 5 );
		linkedList.add( 3, 5 );
		assertEquals( 5, linkedList.node( 1 ).getData() );

		// 예외
		assertNull( linkedList.add( 5, 5 ) );
		assertNull( linkedList.add( -1, 5 ) );

		linkedList.add( 2, 777 );
		assertEquals( 777, linkedList.node( 2 ).getData() );
	}

	public void testRemoveFirst() throws Exception {

		linkedList.addFirst( 2 );
		assertEquals( 2, linkedList.removeFirst().getData() );
	}

	public void testRemove() throws Exception {

		linkedList.add( 0, 5 );
		linkedList.add( 1, 6 );
		linkedList.add( 2, 7 );
		linkedList.add( 3, 8 );

		assertEquals( 7, linkedList.remove( 2 ).getData() );
		assertEquals( 8, linkedList.node( 2 ).getData() );

		// 예외
		assertNull( linkedList.remove( 4 ) );
		assertNull( linkedList.remove( -1 ) );
	}

}