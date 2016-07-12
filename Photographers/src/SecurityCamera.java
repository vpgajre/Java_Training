
public class SecurityCamera implements Photographer {

	@Override
	public void prepareScene() 
	{
		System.out.println("Wrong pin used more than 3 times");	

	}

	@Override
	public String takePhotograph() 
	{
		return "Persons face captured";
	}

}
