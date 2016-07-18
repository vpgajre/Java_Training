import java.awt.Color;

public class Glove implements Colored, Sized
{	
	int size;
	Color color;
	public Glove(int size, Color color)
	{
		this.size = size;
		this.color = color;
	}

	@Override
	public String toString() 
	{
		return "Glove [size=" + size + ", color=" + color + "]";
	}

	@Override
	public int getSize() 
	{
		return size;
	}

	@Override
	public Color getColor() 
	{
		return color;
	}

}
