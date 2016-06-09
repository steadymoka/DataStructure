package list;


import junit.framework.TestCase;


/**
 * 배열에 의한 리스트 구현
 * 자료의 나열
 */
public class ListTest extends TestCase {

	private List list;

	public void setUp() throws Exception {

		super.setUp();
		list = new List();
	}

	public void testInit() throws Exception {

		assertEquals( 0, list.init() );
	}

	public void testIsEmpty() throws Exception {

		list.init();
		assertTrue( list.isEmpty() );

		list.insert( 1, 100 );
		assertFalse( list.isEmpty() );
	}

	public void testInsert() throws Exception {

		list.init();

		// list.insert( int position, int value )

		// 예외상황
		assertFalse( list.insert( 2, 111 ) );
		assertFalse( list.insert( 3, 111 ) );
		assertFalse( list.insert( 6, 111 ) );

		assertTrue( list.insert( 1, 111 ) );
		assertTrue( list.insert( 2, 112 ) );
		assertTrue( list.insert( 3, 113 ) );
		assertTrue( list.insert( 4, 114 ) );
		assertTrue( list.insert( 5, 115 ) );

		assertTrue( list.insert( 3, 77 ) );
		assertEquals( 111, list.get( 1 ) );
		assertEquals( 112, list.get( 2 ) );
		assertEquals( 77, list.get( 3 ) );
		assertEquals( 113, list.get( 4 ) );
		assertEquals( 114, list.get( 5 ) );
		assertEquals( 115, list.get( 6 ) );
	}

}