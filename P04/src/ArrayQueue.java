/**
 * Array Based implementation of a Queue
 * @author jovanikimble
 *
 */
public class ArrayQueue implements Queue {
	
	private int head;
	private int tail;
	private Object[] arr;
	
	public ArrayQueue() {
		this.head = 0;
		this.tail = 0;
		this.arr = new Object[5];
	}

	/* 
	 * Returns the element at the head of
	 * the array
	 */
	@Override
	public Object dequeue() {
		if(this.head == this.tail) {
			return null;
		}
		
		Object item = arr[this.head];
		this.head = (head + 1) % this.arr.length;
		return item;
	}

	/* 
	 * Inserts element at the tail, end of Queue
	 */
	@Override
	public void enqueue(Object item) {
		if((this.tail + 1) % this.arr.length == this.head) {
			growQueue();
		}
		this.arr[this.tail] = item;
		this.tail = (tail + 1) % this.arr.length;
	}

	/* 
	 * Returns whether or not Queue is empty
	 */
	@Override
	public boolean empty() {
		return this.head == this.tail;
	}
	
	/**
	 * Grows Queue to double of previous size;
	 */
	private void growQueue() {
		Object[] tempArr = new Object[this.arr.length * 2];
		
		int n = this.arr.length;
		for(int i = 0; i < n; i++) {
			tempArr[i] = this.arr[(this.head + i) % this.arr.length]; 
		}
		
		this.arr = tempArr;
		
		// Updating head and tail to it's positions
		// in the larger array
		this.head = 0;
		this.tail = n - 1;
	}
}
