
public class Main {

	public static void main(String[] args) 
	{
		Photographer[] photos = {new SpySatellite(), new TrafficCamera(), new SecurityCamera(), new TrafficCamera()};
		for(Photographer pic : photos)
		{
			pic.prepareScene();
			System.out.println(pic.takePhotograph());
			System.out.println();
		}
	}

}
