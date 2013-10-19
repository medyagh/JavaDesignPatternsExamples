package SubClassingExample;

class Queue {
	public boolean isEmpty() { /* ... */
		System.out.println("checkinf if it is empy");
		return false;
	}

	public void enqueue(Object i) { /* put item at rear */
		System.out.println("doing enqueue");
	}

	public Object dequeue() { /* remove & return front item */

		System.out.println("doing dequeue");
		return null;
	}
	// some implementation
}