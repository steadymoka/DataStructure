package queue;


public class Queue {

	private int[] queue;
	private int size;

	public Queue( int size ) {

		queue = new int[size];
		size = 0;
	}

	public boolean insert( Integer data ) {

		if ( null == data )
			return false;

		queue[size] = data;
		size++;

		return true;
	}

	public int size() {

		return size;
	}

	public int peak() {

		return queue[0];
	}

	public int remove() {

		if ( 0 == size )
			return -1;

		int temp = queue[0];

		for ( int i = 0; i < size; i++ ) {

			if ( 0 < i )
				queue[i - 1] = queue[i];
		}

		size--;
		return temp;
	}

}
