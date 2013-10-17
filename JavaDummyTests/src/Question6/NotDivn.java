package Question6;

class NotDivn implements Predicate {
	  final private int _n;
	  NotDivn(int n) {
	    _n = n;
	  }
	  public boolean eval(int m) {
	    return (m%_n) != 0;
	  }
	}
	class WhatAPain extends Stream { 
	  private Stream _it;
	  
	  public WhatAPain(Stream it) {
	    _it = it;
	  }
	  
	  public Object next() {  
	    final int n = (int) _it.next();
	    final Predicate d = new NotDivn(n);
	    Stream newit = new FilteredStream(_it, d);
	    _it = newit;
	    return (new Integer(n));
	  }

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	} 
	}
