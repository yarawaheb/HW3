package images;

public class Gradient extends BaseImage{
	
	private RGB start; 
	private RGB end;
	
	public Gradient(int width, int hieght, RGB start, RGB end)
	{
		super(width, hieght);
		
		this.start = start;
		
		this.end = end;
	}
	
	@Override
	public RGB get(int x, int y)
	{
		double alpha;
		
		RGB color;
		
		if ( x < (width / 2) )
		{
			alpha = 1 -  (double)((double)x /(double)width);
			
			color =  RGB.mix(start, end, alpha);
		}
		else
		{
			alpha = ((double)(width - (x)) )/ (double)width;
			
			color =  RGB.mix(start, end,  alpha);
		}
		
		
		return color;
	}
	
}
