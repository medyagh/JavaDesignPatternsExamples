package SubClassingExample;

class StackImpl extends Queue implements Stack {
	public void push(Object i) { /* put item at front */
	}

	public Object pop() {
		return this.dequeue();
	}
}