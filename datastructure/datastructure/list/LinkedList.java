package list;


public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;

	public int init() {

		size = 0;
		head = null;

		return size;
	}

	public boolean isEmpty() {

		return size == 0;
	}

	public Node addFirst( int input ) {

		Node newNode = new Node( input );

		newNode.next = head;
		head = newNode;

		size++;

		if ( null == head.next )
			tail = head;

		return newNode;
	}

	public Node node( int index ) {

		Node x = head;

		for ( int i = 0; i < index; i++ )
			x = x.next;

		return x;
	}

	public Node add( int index, int input ) {

		if ( index < 0 )
			return null;

		if ( index == 0 ) {

			return addFirst( input );
		}
		else if ( index <= size ) {

			Node temp1 = node( index - 1 );
			Node temp2 = temp1.next;
			Node newNode = new Node( input );

			temp1.next = newNode;
			newNode.next = temp2;

			size++;

			if ( newNode.next == null )
				tail = newNode;

			return newNode;
		}
		else
			return null;
	}

	public Node removeFirst() {

		Node temp = head;
		head = temp.next;

		size--;

		return temp;
	}

	public Node remove( int k ) {

		if ( k > size || k < 0 )
			return null;

		if ( k == 0 )
			return removeFirst();

		// 삭제 앞 노드
		Node temp = node( k - 1 );

		Node deletedNode = temp.next;

		// 삭제 앞 노드의 next 를 삭제 다음 노드를 가르킨다.
		temp.next = temp.next.next;

		if ( deletedNode == tail )
			tail = temp;

		size--;

		return deletedNode;
	}

	public class Node {

		private int data;
		private Node next;

		public Node( int input ) {

			this.data = input;
			this.next = null;
		}

		public int getData() {

			return data;
		}

	}

}
