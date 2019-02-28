package problem03;

public class MyStack {
	
	private String[] buffer;
	int top;
	int size;
	
	public MyStack( int size ) {
		buffer = new String[size];
		this.size = size;
		this.top = 0;
	}
	
	public void push(String item) {
		if(!isFull())
			buffer[this.top++] = item;
	}

	public String pop() {
		if(!isEmpty()) 
			return buffer[--this.top];	
		return "null";
	}

	public boolean isEmpty() {
		if(this.top == 0)
			return true;
		
		return false;
	}
	
	public boolean isFull() {
		if(this.top == this.size)
			return true;
		return false;
	}
	
	public int size() {
		return this.size;
	}
}