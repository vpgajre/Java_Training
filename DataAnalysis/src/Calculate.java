import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) 
	{
		Calculate cal = new Calculate();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of the numbers");
		int count = scan.nextInt();
		double[] numbers = new double[count];
		System.out.println("Enter the numbers");
		for(int i = 0; i < count; i++)
		{
			numbers[i] = scan.nextDouble();
		}

		System.out.println("Mean: " +cal.calculateMean(numbers));
		System.out.println("Max: "+cal.calculateMax(numbers));
		System.out.println("Min: "+cal.calculateMin(numbers));
		scan.close();

	}

	public double calculateMean(double[] numbers)
	{
		double sum = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			sum+=numbers[i];
		}
		return (sum/numbers.length);
	}

	public double calculateMax(double[] numbers)
	{
		double max = numbers[0];
		for(int i = 1; i < numbers.length; i++)
		{
			if(max < numbers[i])
				max = numbers[i];
		}
		return max;
	}

	public double calculateMin(double[] numbers)
	{
		double min = numbers[0];
		for(int i = 1; i < numbers.length; i++)
		{
			if(min > numbers[i])
				min = numbers[i];
		}
		return min;
	}

}
