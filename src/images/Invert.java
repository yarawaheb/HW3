package images;

public class Invert extends ImageDecorator{
	
	public Invert(Image base)
	{
		super(base);
	}
	
	public RGB get(int x, int y)
	{
		RGB color = base.get(x, y);
		
		return color.invert();
	}
	
}
