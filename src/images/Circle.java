package images;

public class Circle extends BaseImage{
	
	 private int centerX;
	 
	 private int centerY;
	 
	 private int radius;
	 
	 private RGB center;
	 
	 private RGB outside;
	
	 public Circle(int width, int hieght, int centerX , int centerY , int radius, RGB center, RGB outside)
	 {
		 super(width, hieght);
		 
		 this.centerX = centerX;
		 
		 this.centerY = centerY;
		 
		 this.radius = radius;
		 
		 this.center = center;
		 
		 this.outside = outside;
	 }
	 
	 public Circle(int size, int radius, RGB center , RGB outside)
	 {
		 super(size, size);
		 
		 this.centerX = size/2;
		 
		 this.centerY = size/2;
		 
		 this.radius = radius;
		 
		 this.center = center;
		 
		 this.outside = outside;
	 }
	 
	 @Override
	 public RGB get(int x, int y)
	 {
	    double alpha;
	    
		double d;
		
		// Calculate the distance of the pixel from the center
		d = Math.sqrt(Math.pow(((double)x - (double)centerX), 2.0) + Math.pow(((double)y - (double)centerY), 2.0));
		
		alpha =  (d/(double)radius >  1) ? 1.0 : d/(double)radius;
		
		return RGB.mix(outside, center, alpha);
	 }
	 
}
