package queue;


import junit.framework.Assert;
import junit.framework.TestCase;


/**
 * 젤먼저 넣으게 젤먼전 나온다.
 */
public class QueueTest extends TestCase {

	private Queue queue;

	public void setUp() throws Exception {

		super.setUp();
		queue = new Queue( 100 );
	}

	/**
	 * 넣는거
	 */
	public void testInsert() throws Exception {

		Assert.assertEquals( true, queue.insert( 1 ) );
		Assert.assertEquals( 1, queue.size() );

		Assert.assertEquals( true, queue.insert( 3 ) );
		Assert.assertEquals( true, queue.insert( 7 ) );
		Assert.assertEquals( 3, queue.size() );

		Assert.assertEquals( false, queue.insert( null ) );
	}

	/**
	 * 보고 안뺴기
	 */
	public void testPeak() throws Exception {

		Assert.assertEquals( true, queue.insert( 4 ) );
		Assert.assertEquals( true, queue.insert( 7 ) );
		Assert.assertEquals( true, queue.insert( 8 ) );

		Assert.assertEquals( 4, queue.peak() );
		Assert.assertEquals( 3, queue.size() );
	}

	/**
	 * 보고 빼는거 없애
	 */
	public void testRemove() throws Exception {

		Assert.assertEquals( true, queue.insert( 4 ) );
		Assert.assertEquals( true, queue.insert( 7 ) );
		Assert.assertEquals( true, queue.insert( 8 ) );

		Assert.assertEquals( 4, queue.remove() );
		Assert.assertEquals( 2, queue.size() );

		Assert.assertEquals( 7, queue.remove() );
		Assert.assertEquals( 1, queue.size() );
		Assert.assertEquals( 8, queue.remove() );
		Assert.assertEquals( 0, queue.size() );

		Assert.assertEquals( -1, queue.remove() );
	}

}
