import java.util.Scanner;

class BadMonth extends Exception
{

	public BadMonth()
	{
		super("This month is incorrect");
	}
}

class BadDay extends Exception
{

	public BadDay()
	{
		super("This day does not exist for the given month");
	}
}

public class Main 
{
	private int[] month_days = {31, 28, 31, 30, 31,30, 31, 31, 30, 31, 30, 31};

	public enum months
	{
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	public static void main(String[] args) throws BadDay, BadMonth
	{
		Scanner scan = new Scanner(System.in);
		String month;
		int day;
		while(true)
		{
			System.out.println("Enter the month");
			month = scan.next();
			month = month.toUpperCase();
			if(month.equals("QUIT"))
				break;
			System.out.println("Enter the day");
			day = scan.nextInt();	
			Main m = new Main();
			try
			{
				m.convert(month,day);
			}
			catch(Exception e)
			{
				System.out.println("Exception: "+e);
			}
		}
		scan.close();
	}

	public void convert(String line, int number) throws BadDay, BadMonth
	{
		try
		{
			if(validateMonth(line))
			{
				validateDate(number,line);
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public boolean validateMonth(String month) throws BadMonth
	{
		try
		{
			months.valueOf(month);
		}
		catch(Exception e)
		{
			throw new BadMonth();
		}
		return true;
	}

	public void validateDate(int number, String month) throws BadDay
	{
		int position = months.valueOf(month).ordinal();
		if(number > month_days[position])
		{
			throw new BadDay();
		}
		else if(number < 1)
		{
			throw new BadDay();
		}
		else
			System.out.println("Valid");
	}
}

