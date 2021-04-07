package images;

public class TwoColorImage extends BaseImage {

	private RGB zero; 
	
	private RGB one; 
	
	private TwoDFunc func;
	
	public TwoColorImage(int width, int height, RGB zero, RGB one, TwoDFunc func)
	{
		super(width, height);
		
		this.zero = zero;
		
		this.one = one;
		
		this.func = func;
	}
	
	
	public RGB get(int x, int y)
	{
		double  alpha = func.f( ((double)x/(double)width), ((double)y/(double)hieght));
		
		if(alpha <= 0)
		{
			return zero;
		}
		else if (alpha >= 1)
 		{
			return one;
		}
		
		
		return RGB.mix(zero, one, 1-alpha);
	}
	
}
