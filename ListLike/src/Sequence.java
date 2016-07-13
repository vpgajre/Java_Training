import java.util.Iterator;

public class Sequence implements Iterable<String>
{
	String[] storage;
	static int count;
	public Sequence(int size)
	{
		storage = new String[size];
	}
	
	public void add(String item)
	{
		if(count != storage.length-1)
		{
			storage[count++] = item;
		}
		else
		{
			System.out.println("Storage is full");
		}
	}
	
	public String get(int index)
	{
		return storage[index];
	}
	
	public int size()
	{
		return count;
	}

	@Override
	public SequenceIterator iterator() 
	{
		return new SequenceIterator();
	}
	
	class SequenceIterator implements Iterator<String>
	{
		private int progress;
		@Override
		public boolean hasNext() 
		{
			if(progress < count)
				return true;
			return false;
		}

		@Override
		public String next() 
		{
			return storage[progress++];
		}
		
		public void remove() throws UnsupportedOperationException
		{
			throw new UnsupportedOperationException();
		}
		
		
	}
}
