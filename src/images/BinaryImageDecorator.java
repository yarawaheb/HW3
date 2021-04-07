package images;

public abstract class BinaryImageDecorator implements Image {
	
	protected Image base1; 
	
	protected Image base2; 
	
	protected int ImageWidth;
	
	protected int ImageHieght;
	
	public BinaryImageDecorator(Image base1, Image base2)
	{
		this.base1 = base1;
		
		this.base2 = base2;
		
		ImageWidth = Math.max(this.base1.getWidth() ,this.base2.getWidth());
		
		ImageHieght = Math.max(this.base1.getHeight() ,this.base2.getHeight());
	}
	
	public int getWidth()
	{
		return ImageWidth;
	}
	
	public int getHeight()
	{
		return ImageHieght;
	}
	
	public abstract RGB get(int x, int y);

}
