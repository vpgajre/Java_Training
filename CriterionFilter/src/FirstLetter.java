
public class FirstLetter implements StringCriterion 
{
	private String letter;
	public FirstLetter(String letter) 
	{
		this.letter = letter;
	}
	@Override
	public boolean test(String line) 
	{
		if(line.startsWith(letter))
			return true;
		
		return false;
	}

}
