
public class ArrayQueue implements Queue {
	
	private int head;
	private int tail;
	private Object[] arr;
	
	public ArrayQueue() {
		this.head = 0;
		this.tail = 0;
		this.arr = new Object[10];
	}

	@Override
	public Object dequeue() {
		if(head == tail ) {
			return null; 
		}
		return null;
	}

	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void resize() {
		Object[] tempArr = new Object[this.arr.length * 2];
	}

}
