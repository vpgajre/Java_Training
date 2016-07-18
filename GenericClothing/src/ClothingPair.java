
public class ClothingPair<T extends Sized & Colored>
{
	private T pair1, pair2;
	public ClothingPair(T pair1, T pair2)
	{
		if(pair1.getClass().getName().equals(pair2.getClass().getName()) && (pair1.getClass().getName().equals("Sock") || pair1.getClass().getName().equals("Glove")))
		{
			this.pair1 = pair1;
			this.pair2 = pair2;
			System.out.println("Happy");
		}
		else
			System.out.println("Not Happy");
	}
	
	public boolean isMatched()
	{
		if(pair1!=null && pair2!=null && pair1.getSize() == pair2.getSize() && pair1.getColor() == pair2.getColor())
			return true;
		return false;
	}
}
