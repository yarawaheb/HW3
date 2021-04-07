package circuits;

public class OrGate extends Gate{

	public OrGate(Gate[] inGates) {
		super(inGates);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {
		for(boolean b:inValues)
			if(b) return true;
		return false;
	}

	@Override
	public String getName() {
		return "OR";
	}

	@Override
	public Gate simplify() {
		Gate[] newInGates;
		int n=0,k=0;
		for(int i=0;i<inGates.length;i++) {
			if(inGates[i].equals(TrueGate.instance()))return inGates[i];
			if(!inGates[i].equals(FalseGate.instance()))n++;
		}
		newInGates=new Gate[n];
		for(int i=0;i<inGates.length;i++) {
			if(!inGates[i].equals(FalseGate.instance())) {
				newInGates[k]=inGates[i].simplify();
				k++;
			}
		}
		if(n==1)return newInGates[0].simplify();
		if(n==0)return FalseGate.instance();
		return new OrGate(newInGates);
	}
			
			
	

}
