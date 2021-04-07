package images;

public class RGB {
	
	private double red;
	private double green;
	private double blue;
	
	public RGB(double red, double green, double blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public RGB (double gray)
	{
		red = gray;
		green = gray;
		blue = gray;
	}
	
	public double getRed()
	{
		return red;
	}
	
	public double getBlue()
	{
		return blue;
	}

	public double getGreen()
	{
		return green;
	}
	
	public RGB invert()
	{
		return new RGB( (1 - red), (1 - green), (1 - blue) );
	}
	
	public RGB filter(RGB filter)
	{
		return new RGB((red * filter.getRed()),
				       (green * filter.getGreen()),
				       (blue * filter.getBlue()));
	}
	
	
	public static RGB superpose(RGB rgb1, RGB rgb2)
	{
		double red = (rgb1.getRed()+rgb2.getRed());
		red = (red >= 1) ? 1 : red;
		
		double green = (rgb1.getGreen()+rgb2.getGreen());
		green = (green >= 1) ? 1 : green;
		
		double blue = (rgb1.getBlue()+rgb2.getBlue());
		blue = (blue >= 1) ? 1 : blue;
		
		return new RGB(red, green, blue);
	}
	
	public static RGB mix(RGB rgb1, RGB rgb2, double alpha)
	{
		double red = (alpha * rgb1.getRed()) + ((1-alpha) * rgb2.getRed());
		red = (red >= 1) ? 1 : red;
		
		double green = (alpha * rgb1.getGreen()) + ((1-alpha)* rgb2.getGreen());
		green = (green >= 1) ? 1 : green;
		
		double blue = (alpha * rgb1.getBlue()) + ((1-alpha)* rgb2.getBlue());
		blue = (blue >= 1) ? 1 : blue;
		
		return new RGB(red, green, blue);
	}
	
	@Override
	public String toString()
	{
		//return String.format("%s , %.4f% , %.4f% , %.4f% %s", "<", red, green, blue, ">");
		return String.format("<%.4f, %.4f, %.4f>", red, green, blue);

	}
	
	public static final RGB BLACK = new RGB(0);
	public static final RGB WHITE = new RGB(1);
	public static final RGB RED = new RGB(1,0,0);
	public static final RGB GREEN = new RGB(0,1,0);
	public static final RGB BLUE = new RGB(0,0,1);	

}
