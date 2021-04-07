package images;

public abstract class ImageDecorator implements Image{
	
	Image base ;
	
	public ImageDecorator(Image base)
	{
		this.base = base;
	
	}
	
    public int getWidth() 
    {
    	return base.getWidth();
    }
	
	public int getHeight()
	{
		return base.getHeight();
	}
	
	public abstract RGB get(int x, int y);

}
