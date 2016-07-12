
public class SpySatellite implements Photographer 
{
	@Override
	public void prepareScene() 
	{
		System.out.println("Theif running from the jail");
	}

	@Override
	public String takePhotograph() 
	{
		return "Theif's location captured";
	}
}
