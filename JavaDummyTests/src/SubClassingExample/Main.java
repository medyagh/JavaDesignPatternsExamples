package SubClassingExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImpl impl=new StackImpl();
		impl.dequeue();
		impl.pop();
		
		Queue q = new StackImpl();     // Stack Impl is subtype of que
		q.dequeue();
		// q.pop();  //WON'T WORK

		Queue p= impl;
		//p.pop();
		
		Stack s= new StackImpl(); // Works  so Stack Impl is sub time of Stack
		
		
		
	}

}
