package Question6;

public class Main {

	public static void main(String[] args) {
		IntegerStream I = new IntegerStream();
		System.out.println(I.next()); // prints 0 on the screen
		System.out.println(I.next()); // prints 1 on the screen
		System.out.println(I.next()); // prints 2 on the screen
		System.out.println(I.next()); // prints 3 on the screen
		System.out.println(I.next()); // prints 4 on the screen
		
		WhatAPain w = new WhatAPain(I);

		System.out.println(w.next());
		System.out.println(w.next());
		System.out.println(w.next());
		System.out.println(w.next());
		System.out.println(w.next());
		System.out.println(w.next());
		System.out.println(w.next());
		System.out.println(w.next());
		System.out.println(w.next());
		System.out.println(w.next());
		System.out.println(w.next());
		

	}

}
