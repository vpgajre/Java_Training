import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main 
{

	public static void main(String[] args) 
	{
		List<String> ls = Arrays.asList("Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby");
		StringCriterion sc = new Vowels();
				List<String> longStrings = stringFilter(ls,sc);
				assert longStrings.size() == 7;
				assert longStrings.get(0).equals("William");
				assert longStrings.get(0).equals("Susannah");
				assert longStrings.get(2).equals("Orinoco");
		
	}
	
	public static List<String> getLongStrings(List<String> ls, int threshold)
	{
		List<String> result = new ArrayList<String>();
		for(String line : ls)
		{
			if(line.length() > threshold)
				result.add(line);
		}
		
		return result;
	}

	public static List<String> stringFilter(List<String> list, StringCriterion sc)
	{
		List<String> result = new ArrayList<String>();
		if(sc.getClass().getName().equals("Longer"))
		{
			for(String line : list)
			{
				Longer longer = (Longer)sc;
				boolean flag = longer.test(line);
				if(flag)
					result.add(line);
			}
		}
		
		else if(sc.getClass().getName().equals("FirstLetter"))
		{
			for(String line : list)
			{
				FirstLetter longer = (FirstLetter)sc;
				boolean flag = longer.test(line);
				if(flag)
					result.add(line);
			}
		}
		
		else if(sc.getClass().getName().equals("Vowels"))
		{
			for(String line : list)
			{
				Vowels longer = (Vowels)sc;
				boolean flag = longer.test(line);
				if(flag)
					result.add(line);
			}
		}
		
		else
			return null;
		
		return result;
	}
}
