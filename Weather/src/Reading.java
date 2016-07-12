public class Reading 
{
	String day_of_week;
	int hour_of_day;
	int temperature;
	int speed;

	public Reading(String line)
	{
		String[] elements = line.split(", ");
		day_of_week = elements[0];
		hour_of_day = Integer.valueOf(elements[1]);
		temperature = Integer.valueOf(elements[2]);
		speed = Integer.valueOf(elements[3]);
	}

	public String rateTemperature()
	{
		if(temperature < 55)
			return "Cold";
		else if(temperature < 65)
			return "Mild";
		else if(temperature < 80)
			return "Warm";
		else
			return "Hot";
	}

	public String getTime()
	{
		if(hour_of_day == 9)
		{
			return day_of_week+" morning";
		}
		else if(hour_of_day == 15)
		{
			return day_of_week+" afternoon";
		}
		else
		{
			return day_of_week+" evening";
		}
	}
}
