import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input and output filenames");
		String input = scan.nextLine();
		String output = scan.nextLine();
		copyFiles(input, output);
		scan.close();
	}

	private static void copyFiles(String input, String output) 
	{
		Scanner scan = new Scanner(System.in);
		
		File input_file = null;
		File output_file = null;
		try
		{
			input_file = new File(input);
			
			while(!input_file.exists())
			{
				System.out.println("File does not exist!");
				System.out.println("Enter the input file name again");
				input = scan.nextLine();
				input_file = new File(input);
			}
			output_file = new File(output);
			BufferedReader br;
			BufferedWriter bw;
			br = new BufferedReader(new FileReader(input_file));
			bw = new BufferedWriter(new FileWriter(output_file));
			String line = br.readLine();
			while(line!=null)
			{
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}
			System.out.println("File copied successfully");
			br.close();
			bw.close();
			scan.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception" +e);
			System.out.println("Enter the output file name again");
			output_file = new File(scan.nextLine());
			copyFiles(input, output);
		}
	}
}
