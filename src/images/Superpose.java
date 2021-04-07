package images;

public class Superpose extends BinaryImageDecorator{
	
	
	public Superpose(Image base1, Image base2)
	{
		super(base1, base2);
	}

	
	public RGB get(int x, int y)
	{
		RGB color;
		if ( ((x <= base1.getWidth()) && (x <= base2.getWidth()))
				&& (((y <= base1.getHeight()) && (y <= base2.getHeight()))))
		{
			color = RGB.superpose(base1.get(x, y),base2.get(x, y));
		}
		else if ( ((x <= base1.getWidth()) && (y <= base1.getHeight())) )
		{
			color = base1.get(x, y);
		}
		else if ( ((x <= base2.getWidth()) && (y <= base2.getHeight())) )
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
