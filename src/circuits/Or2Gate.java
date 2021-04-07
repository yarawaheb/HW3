package circuits;

public class Or2Gate extends OrGate {

	public Or2Gate(Gate g1, Gate g2) {
		super(gateArray(g1, g2));
	}
	private static Gate[] gateArray(Gate g1, Gate g2) {
		Gate[] g =new Gate[2];
		g[0]=g1;
		g[1]=g2;
		return g;
	}

}
