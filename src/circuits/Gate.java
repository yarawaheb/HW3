package circuits;

public abstract class Gate {
	protected Gate[] inGates;

	public Gate(Gate[] inGates) {
		this.inGates = inGates;
	}

	public boolean calc() throws CircuitException{
		boolean[] temp=null ;
		try {
			temp= new boolean[inGates.length];
			for(int i=0;i<inGates.length;i++) {
				if(inGates[i].inGates==null)
					temp[i]=inGates[i].func(null);
				else temp[i]=inGates[i].calc();
			}
			}catch(NullPointerException e){
			
			}

		return func(temp);
		
	}
	protected abstract boolean func(boolean[] inValues) throws CircuitException;
		
    public abstract String getName() ;
	
    public abstract Gate simplify() ;
    	
    
    public String toString() {
    	String s=getName();
    	if (inGates==null)
    		return s;
    	s+="[";
    	for(Gate g:inGates) {
    		s+=g.toString();
    		s+=", ";
    	}
    	s=s.substring(0, s.length()-2);
    	s+="]";
    	return s;
    }
    
/*public static void main(String[] args) {
	VarGate v1 = new VarGate("1");
	VarGate v2 = new VarGate("2");
			
	Gate g1 = new Or2Gate(FalseGate.instance(), TrueGate.instance());
	Gate g2 = new Or2Gate(v1, new NotGate(v2)); 
	Gate out = new AndGate(new Gate[] { g1, g2, TrueGate.instance() });
			
	//v1.setVal(false);
	//v2.setVal(true);
	//try {
	//	System.out.println(out + " = " + out.calc());
		System.out.println(out + " = " + out.simplify());
		v1.setVal(false);
		//v2.setVal(true);
		System.out.println(out + " = " + out.simplify());

	/*} catch (CircuitException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/

//}
}
