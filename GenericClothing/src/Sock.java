import java.awt.Color;

public class Sock implements Colored, Sized
{

	int size;
	Color color;
	public Sock(int size, Color color)
	{
		this.size = size;
		this.color = color;
	}
	
	@Override
	public String toString() 
	{
		return "Sock [size=" + size + ", color=" + color + "]";
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
