package circuits;

public class VarGate extends Gate{
	private String name;
	private boolean value;
	private int temp=0;
	
	public VarGate(String name) {
		super(null);
		this.name=name;
	}

	public void setVal(boolean value) {
		this.value=value;
		temp=1;
	}
	
	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {
		if(temp==0)
			throw ( new  CircuitException("value is not initialize ") );
		return value;
	}

	@Override
	public String getName() {
		return "V"+name;
	}

	@Override
	public Gate simplify() {
		if(temp==0)return this;
		if(value)return TrueGate.instance();
		return FalseGate.instance();
	}
}
