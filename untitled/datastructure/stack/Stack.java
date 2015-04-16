package stack;


public class Stack {

	private int top;
	private int[] stack;
	private int size = 0;

	public Stack( int size ) {

		this.top = -1;
		this.stack = new int[size];
		this.size = size;
	}

	public int getStackTopIndex() {

		return top;
	}

	public int getSize() {

		return top + 1;
	}

	public boolean push( Integer element ) {

		if ( top >= size - 1 || element == null )
			return false;

		top++;
		stack[top] = element;

		return true;
	}

	public Integer pop() {

		if ( isEmpty() )
			return null;

		return stack[top--];
	}

	public boolean isEmpty() {

		return top == -1;
	}

}
