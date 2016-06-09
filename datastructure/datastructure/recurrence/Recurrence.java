package recurrence;


public class Recurrence {

	private int array[];

	public void initArrayFroBinary() {


		array = new int[10000];
		for ( int i = 0; i < 10000; i++ ) {

			array[i] = i;
		}
	}

	public int binarySearch( int key, int startNum, int endNum ) {

		int centerIndex = ( startNum + endNum ) / 2;
		int centerValue = array[centerIndex];

		if ( key == centerValue )
			return centerValue;
		else if ( key < startNum || key > endNum )
			return -1;
		else if ( key < centerValue )
			return binarySearch( key, startNum, centerIndex - 1 );
		else
			return binarySearch( key, centerIndex + 1, endNum );
	}

	public int factorial( int num ) {

		if ( num < 0 )
			return -1;

		if ( 1 == num || 0 == num )
			return 1;
		else
			return num * factorial( num - 1 );
	}

	public int factorial( int n, int a ) {

		if ( n > -1 ) {

			if ( n == 0 )
				return a;
			else
				return factorial( n - 1, n * a );
		}
		else {

			return -1;
		}
	}

	public void reverse( char[] s, int first, int last ) {

		if ( first > last ) {

			return;
		}
		else {

			reverse( s, first + 1, last );
			System.out.print( s[first] );
		}
	}

	public int fibonacci( int n ) {

		if ( 0 > n )
			return -1;

		if ( n < 2 )
			return 1;
		else
			return fibonacci( n - 1 ) + fibonacci( n - 2 );
	}

	public char[] reverse2( char[] s, char[] r, int size ) {

		if ( size < 0 )
			return null;

		if ( null == r )
			r = new char[size];

		int firstSize = s.length;

		if ( 0 != size )
			r[firstSize - size] = s[size - 1];

		if ( 0 == size )
			return r;
		else
			return reverse2( s, r, size - 1 );
	}

}
