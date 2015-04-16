package recurrence;


import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;


public class RecurrenceTest extends TestCase {

	private Recurrence recurrence;

	public void setUp() throws Exception {

		recurrence = new Recurrence();
	}

	public void testBinarySearch() throws Exception {

		recurrence.initArrayFroBinary();

		Assert.assertEquals( 2, recurrence.binarySearch( 2, 1, 3 ) );

		Assert.assertEquals( 44, recurrence.binarySearch( 44, 1, 100 ) );
		Assert.assertEquals( 22, recurrence.binarySearch( 22, 1, 100 ) );
		Assert.assertEquals( 100, recurrence.binarySearch( 100, 1, 100 ) );

		Assert.assertEquals( 77, recurrence.binarySearch( 77, 50, 100 ) );
		Assert.assertEquals( 50, recurrence.binarySearch( 50, 50, 100 ) );
		Assert.assertEquals( 100, recurrence.binarySearch( 100, 50, 100 ) );

		// 예외 상황
		Assert.assertEquals( -1, recurrence.binarySearch( -1, 50, 100 ) );
		Assert.assertEquals( -1, recurrence.binarySearch( 101, 50, 100 ) );
	}

	public void testFactorial() throws Exception {

		Assert.assertEquals( 1, recurrence.factorial( 0 ) );
		Assert.assertEquals( 1, recurrence.factorial( 1 ) );
		Assert.assertEquals( 2, recurrence.factorial( 2 ) );
		Assert.assertEquals( 6, recurrence.factorial( 3 ) );
		Assert.assertEquals( 24, recurrence.factorial( 4 ) );

		// 예외 상황
		Assert.assertEquals( -1, recurrence.factorial( -1 ) );
		Assert.assertEquals( -1, recurrence.factorial( -3 ) );
	}

	public void testReverse() throws Exception {

		char s[] = new char[4];

		s[0] = 'G';
		s[1] = 'o';
		s[2] = 'o';
		s[3] = 'd';

		recurrence.reverse( s, 0, 3 );
	}

	public void testReverse2() throws Exception {

		char s[] = new char[4];
		s[0] = 'G';
		s[1] = 'o';
		s[2] = 'o';
		s[3] = 'd';

		char e[] = new char[4];
		e[0] = 'd';
		e[1] = 'o';
		e[2] = 'o';
		e[3] = 'G';

		assertTrue( Arrays.equals( e, recurrence.reverse2( s, null, 4 ) ) );
		Assert.assertEquals( e[1], recurrence.reverse2( s, null, 4 )[1] );
		Assert.assertEquals( e[2], recurrence.reverse2( s, null, 4 )[2] );
		Assert.assertEquals( e[3], recurrence.reverse2( s, null, 4 )[3] );

		// 예외 상황
		assertNull( recurrence.reverse2( s, null, -1 ) );
	}

	public void testFibonacci() throws Exception {

		// 전제 조건
		Assert.assertEquals( 1, recurrence.fibonacci( 0 ) );
		Assert.assertEquals( 1, recurrence.fibonacci( 1 ) );

		Assert.assertEquals( 2, recurrence.fibonacci( 2 ) );
		Assert.assertEquals( 3, recurrence.fibonacci( 3 ) );
		Assert.assertEquals( 5, recurrence.fibonacci( 4 ) );
		Assert.assertEquals( 8, recurrence.fibonacci( 5 ) );

		// 예외상황
		Assert.assertEquals( -1, recurrence.fibonacci( -1 ) );
	}

	public void testFactorialForTailRecursion() throws Exception {

		Assert.assertEquals( 6, recurrence.factorial( 3, 1 ) );
		Assert.assertEquals( 24, recurrence.factorial( 4, 1 ) );
		Assert.assertEquals( 120, recurrence.factorial( 5, 1 ) );

		// 예외상황
		Assert.assertEquals( -1, recurrence.factorial( -1, 1 ) );
	}

}
