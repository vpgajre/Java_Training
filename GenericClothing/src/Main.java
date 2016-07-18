import java.awt.Color;
public class Main {

	public static void main(String[] args) 
	{
		Glove g1 = new Glove(10,Color.BLACK);
		Glove g2 = new Glove(10, Color.BLACK);
		
		Sock s1 = new Sock(8, Color.BLUE);
		Sock s2 = new Sock(6,Color.BLUE);
		
		//tried string parameters but gives error due to use of bounded type
		ClothingPair[] pairs = {new ClothingPair<Glove>(g1,g2), new ClothingPair<Sock>(s1, s2), new ClothingPair(g1,s1)};
		for(int i = 0; i < pairs.length; i++)
		{
			System.out.println(pairs[i].isMatched());
		}
	}

}
