package Question6;

class IntegerStream extends Stream {
	private int _i = -1;

	public Object next() {
		_i++;
		return new Integer(_i);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
