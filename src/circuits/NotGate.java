package circuits;

public class NotGate extends Gate{

	public NotGate(Gate in) {
		super(gateArray(in));

	}

	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {
		return !inValues[0];
	}

	@Override
	public String getName() {
		return "NOT";
	}

	@Override
	public Gate simplify() {
		if(inGates[0].equals(TrueGate.instance()))return inGates[0];
		if(inGates[0].equals(FalseGate.instance()))return inGates[0];
		return this;
	}
	private static Gate[] gateArray(Gate g1) {
		Gate[] g =new Gate[1];
		g[0]=g1;
		return g;
	}
}
