package circuits;

public class AndGate extends Gate{

	public AndGate(Gate[] inGates) {
		super(inGates);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {
		for(boolean b:inValues)
			if(!b) return false;
		return true;
	}

	@Override
	public String getName() {
		return "AND";
	}

	@Override
	public Gate simplify() {
		Gate[] newInGates;
		int n=0,k=0;
		for(int i=0;i<inGates.length;i++) {
			if(inGates[i].equals(FalseGate.instance()))return inGates[i];
			if(!inGates[i].equals(TrueGate.instance()))n++;
		}
		newInGates=new Gate[n];
		for(int i=0;i<inGates.length;i++) {
			if(!inGates[i].equals(TrueGate.instance())) {
				newInGates[k]=inGates[i].simplify();
				k++;
			}
		}
		if(n==1)return newInGates[0].simplify();
		if(n==0)return TrueGate.instance();
		return new AndGate(newInGates).simplify();
	}

}
