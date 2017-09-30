/**
 * Array Based implementation of a Stack
 * @author jovanikimble
 *
 */
public class ArrayStack implements Stack {
	
	private int top;
	private Object[] arr; 
	
	public ArrayStack() {
		this.top = 0;
		this.arr = new Object[10];
	}
	
	/* 
	 * Pushes(adds) Object to the top of the stack
	 */
	@Override
	public void push(Object item) {
		if (this.top == this.arr.length) {
			growStack();
		}
		this.arr[this.top] = item;
		this.top++;

	}

	/* 
	 * Returns item from the top of the Stack
	 */
	@Override
	public Object pop() {
		if (this.top > 0) {
			return this.arr[--this.top];
		} else {
			return null;
		}
	}

	/* 
	 * Returns a copy of the top of the Stack
	 */
	@Override
	public Object peek() {
		if(this.top > 0) {
			return this.arr[top - 1];
		}
		return null;
	}

	/* 
	 * Returns whether the Stack is empty
	 */
	@Override
	public boolean empty() {
		return this.top == 0;
	}
	
	/**
	 * Grows the stack to double the size of the
	 * previous stack
	 */
	public void growStack() {
		Object[] tempArr = new Object[this.arr.length * 2];
		
		for(int i = 0; i < this.arr.length; i++) {
			tempArr[i] = this.arr[i];
		}
		
		this.arr = tempArr;
	}

}
