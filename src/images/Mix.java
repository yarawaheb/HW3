package images;

public class Mix extends BinaryImageDecorator{
	
	private double alpha;
	
	public Mix(Image base1, Image base2, double alpha)
	{
		super(base1, base2);
		
		this.alpha = alpha;
	}
	
	
	public RGB get(int x, int y)
	{
		RGB color;
		if ( ((x < base1.getWidth()) && (x < base2.getWidth()))
				&& (((y < base1.getHeight()) && (y < base2.getHeight()))))
		{
			color = RGB.mix(base1.get(x, y),base2.get(x, y), alpha);
		}
		else if ( ((x < base1.getWidth()) && (y < base1.getHeight())) )
		{
			color =base1.get(x, y);
		}
		else if ( ((x < base2.getWidth()) && (y < base2.getHeight())) )
		{
			color =base2.get(x, y);
		}
		else
		{
			color = RGB.BLACK;
		}
		
		
		return color;
	}
	
}
