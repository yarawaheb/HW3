package circuits;

public class FalseGate extends Gate{

	private static FalseGate instance = null;

	private FalseGate() {
		super(null);
	}

	public static Gate instance() {

		if (instance == null)

		instance = new FalseGate();

		return instance;

		}

	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "F";
	}

	@Override
	public Gate simplify() {
		return instance;
	}

}
