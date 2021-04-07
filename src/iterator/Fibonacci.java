package iterator;

public class Fibonacci implements MyIterator{
	private int upperBound;
	private int first=1;
	private int second=1;
	private int i=0;
	
	public Fibonacci(int upperBound) {
		this.upperBound=upperBound;
	}

	@Override
	public boolean hasNext() {
		return second<upperBound;
	}

	@Override
	public int next() {
		int temp;
		if(i>0 && hasNext()) {
			temp=second;
			second+=first;
			first = temp;
		}
		i++;
		return first;
	}
 
}
