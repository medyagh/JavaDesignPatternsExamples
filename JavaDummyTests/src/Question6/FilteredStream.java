package Question6;

class FilteredStream extends Stream {
	private Stream _it;
	private Predicate _p;

	public FilteredStream(Stream it, Predicate p) {
		_it = it;
		_p = p;
	}

	public Object next() {
		int temp = (int) _it.next();
		while (!_p.eval(temp)) {

			temp = (int) _it.next();
		
		}
		return temp;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}
}
