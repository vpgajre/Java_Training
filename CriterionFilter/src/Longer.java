
public class Longer implements StringCriterion
{
	private int threshold;
	public Longer(int threshold) 
	{
		this.threshold = threshold;
	}

	@Override
	public boolean test(String line) 
	{
		if(line.length() > threshold)
			return true;
		
		return false;
	}

}
