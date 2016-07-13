import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) 
	{
		try
		{
			String line;
			HashMap<String,Integer> all_words = new HashMap<String,Integer>();
			BufferedReader br = new BufferedReader(new FileReader("book.txt"));
			while ((line = br.readLine()) != null)
			{
				String[] words_line = line.split("\\W+");
				for(String word : words_line)
				{
					word = word.toLowerCase();
					if(all_words.containsKey(word))
					{
						int count = all_words.get(word);
						all_words.put(word, ++count);
					}
					else
					{
						all_words.put(word,1);
					}
				}
			}
			br.close();
			System.out.println("Count of the words in the books are:");
			for(Map.Entry<String, Integer> entry : all_words.entrySet())
			{
				System.out.println("Word "+ entry.getKey() + " occurs " +entry.getValue()+" time");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception: " +e);
		}
	}

}
