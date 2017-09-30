public class ArrayStack implements Stack {
	
	private int top;
	private Object[] arr; 
	
	public ArrayStack() {
		this.top = 0;
		this.arr = new Object[10];
	}
	
	@Override
	public void push(Object item) {
		if (this.top == this.arr.length) {
			growStack();
		}
		this.arr[this.top] = item;
		this.top++;

	}

	@Override
	public Object pop() {
		if (this.top > 0) {
			return this.arr[--this.top];
		} else {
			return null;
		}
	}

	@Override
	public Object peek() {
		if(this.top > 0) {
			return this.arr[top - 1];
		}
		return null;
	}

	@Override
	public boolean empty() {
		return this.top == 0;
	}
	
	public void growStack() {
		Object[] tempArr = new Object[this.arr.length * 2];
		
		for(int i = 0; i < this.arr.length; i++) {
			tempArr[i] = this.arr[i];
		}
		
		this.arr = tempArr;
	}

}
