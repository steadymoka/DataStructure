package stack;


public class Stack2 {

	private Node top;
	private Node bottom;

	public boolean push( Integer newNodeData ) {

		if ( null == newNodeData )
			return false;

		Node newNode = new Node( newNodeData );

		if ( bottom == null ) {

			bottom = newNode;
		}
		else {

			Node currentTop = bottom;
			while ( currentTop.next != null )
				currentTop = currentTop.next;

			currentTop.next = newNode;
		}

		top = newNode;

		return true;
	}

	public int pop() {

		Node popped = top;

		if ( bottom == top ) {

			top = null;
			bottom = null;
		}
		else {

			Node currentTop = bottom;
			while ( currentTop != null && currentTop.next != popped )
				currentTop = currentTop.next;

			top = currentTop;
			currentTop.next = null;
		}

		return popped.getData();
	}

	public int getSize() {

		int count = 0;
		Node current = bottom;

		while ( current != null ) {

			current = current.next;
			count++;
		}

		return count;
	}

	public boolean isEmpty() {

		return ( bottom == null );
	}

	public class Node {

		private int data;
		private Node next;

		public Node( int data ) {

			this.data = data;
		}

		public int getData() {

			return data;
		}

	}

}
