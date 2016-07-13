import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) 
	{
		try
		{
			String line;
			HashSet<String> all_words = new HashSet<String>();
			BufferedReader br = new BufferedReader(new FileReader("book.txt"));
			while ((line = br.readLine()) != null)
			{
				String[] words_line = line.split("\\W+");
				for(String word : words_line)
				{
					word = word.toLowerCase();
					all_words.add(word);
				}
			}
			br.close();
			System.out.println("Unique words in the books are:");
			for(String word : all_words)
				System.out.println(word);
		}
		catch(Exception e)
		{
			System.out.println("Exception: " +e);
		}
	}

}
