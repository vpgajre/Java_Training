
public class Vowels implements StringCriterion
{

	@Override
	public boolean test(String line) 
	{
		if(line.contains("a") || line.contains("e") || line.contains("i") || line.contains("o") || line.contains("u"))
			return true;
		
		return false;
	}
	
}
