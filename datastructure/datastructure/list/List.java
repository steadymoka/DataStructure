package list;


import java.util.*;


public class List {

	private static final int MAX = 100;

	private int size;
	private int[] data;

	public int init() {

		data = new int[MAX];
		size = 0;
		return size;
	}

	public boolean isEmpty() {

		return size == 0;
	}

	public boolean insert( int position, int value ) {

		if ( size == MAX ) {

			return false;
		}
		else if ( position > size + 1 || position < 1 ) {

			return false;
		}
		else {

			for ( int i = size; i > position - 1; i-- )
				data[i + 1] = data[i];

			data[position] = value;
			size++;

			return true;
		}
	}

	public int get( int position ) {

		return data[position];
	}

}
