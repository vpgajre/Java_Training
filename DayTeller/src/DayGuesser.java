import java.util.Scanner;
public class DayGuesser 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the day (1-31) or quit to exit");
			String temp = scan.next();
			int day;
			if(temp.equalsIgnoreCase("quit"))
				break;
			else
				day = Integer.valueOf(temp);
			System.out.println("Enter the month (1-12)");
			int month = scan.nextInt();
			System.out.println("Enter the year");
			int year = scan.nextInt();
			if(month == 1 || month == 2)
			{
				month= month+12;
				year = year - 1;
			}
			
			int a = 13*(month + 1)/5;
			int b = (year/4);
			int c = (int)(year / 100)*6;
			int d = year/400;
			int remainder = (day + a + b + c + d + year)%7;
			switch(remainder)
			{
			case 0: System.out.println("Saturday");
					break;
			case 1: System.out.println("Sunday");
					break;
			case 2: System.out.println("Monday");
					break;
			case 3: System.out.println("Tuesday");
					break;
			case 4: System.out.println("Wednesday");
					break;
			case 5: System.out.println("Thursday");
					break;
			case 6: System.out.println("Friday");
					break;
			default: System.out.println("Incorrect logic");
					break;
			}
		}
		scan.close();
	}
}
