import java.util.Random;

public class Main 
{
	public enum state_of_machine
	{
		BAR, MEDAL, COIN, TRIPLEBAR, CHERRY, TRIPLECHERRY, TRIPLECOIN
	}

	public int[] spin()
	{
		int[] position = new int[3];
		for(int i = 0; i < 3; i++)
		{
			Random rand = new Random();
			int number = rand.nextInt(7);
			position[i] = number;
		}
		return position;
	}

	public static void main(String[] args) 
	{
		Main pgm = new Main();
		int[] position = pgm.spin();
		for(int i = 0; i < position.length; i++)
		{
			if(i<position.length-1)
				System.out.print(state_of_machine.values()[position[i]]+":");
			else
				System.out.println(state_of_machine.values()[position[i]]);
		}
	}

}
