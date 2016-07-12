
public class TrafficCamera implements Photographer 
{
	@Override
	public void prepareScene() 
	{
		System.out.println("A car breaks the signal");
	}

	@Override
	public String takePhotograph() 
	{
		return "Number plate captured";
	}
}
