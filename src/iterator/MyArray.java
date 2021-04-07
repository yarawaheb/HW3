package iterator;

public class MyArray implements MyIterator{
	private int[] arr;
	private int i=0;

	public MyArray(int[] arr) {
		this.arr = arr;
	}

	@Override
	public boolean hasNext() {
		return i<arr.length;
	}

	@Override
	public int next() {
		return arr[i++];
	}

}
