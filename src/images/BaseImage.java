package images;

public abstract class BaseImage implements Image {
	
	 protected int width;
	 protected int hieght;
	  
	 public BaseImage(int width, int hieght)
	 {
		 this.width = width;
		 
		 this.hieght = hieght;	 
	 }
	 
    
	 public int getWidth()
	 {
		 return width;
	 }
	 
	 public int getHeight()
	 {
		 return hieght;
	 }
	 
	 
	 public abstract RGB get(int x, int y);
	 
}
