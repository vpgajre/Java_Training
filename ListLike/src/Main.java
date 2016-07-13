
public class Main 
{

	public static void main(String[] args) 
	{
//		Sequence s = new Sequence(10);
//		assert s.size() == 0;
//		s.add("Hello");
//		s.add("there");
//		assert s.size() == 2;
//		assert s.get(0).equals("Hello");
//		assert s.get(1).equals("there");
//		s.add("done");
//		assert s.size() == 3;
//		assert s.get(0).equals("Hello");
//		assert s.get(1).equals("there");
//		assert s.get(2).equals("done");
		
		
		Sequence s = new Sequence(10);
		s.add("Hello");
		s.add("there");
		s.add("done");
		Sequence.SequenceIterator i1 = s.iterator();
		Sequence.SequenceIterator i2 = s.iterator();
		assert i1.hasNext();
		assert i1.next().equals("Hello");
		assert i1.hasNext();
		assert i1.next().equals("there");
		assert i2.hasNext();
		assert i2.next().equals("Hello");
		assert i1.hasNext();
		assert i1.next().equals("done");
		assert i1.hasNext() == false;
		assert i2.next().equals("there");
		assert i2.next().equals("done");
		assert i2.hasNext() == false;
		
		for (String o : s) 
		{
			System.out.println(o);
		}
	}

}
