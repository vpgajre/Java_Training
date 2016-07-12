
public class Main 
{
	static String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
	

	public static int toNumber(String arg)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			if(arg.equals(numbers[i]))
				return i;

		}
		return -1;
	}
	
	public static int addUp(int... arg1)
	{
		System.out.println("int method executed");
		int sum = 0;
		for(int i = 0; i < arg1.length; i++)
			sum+=arg1[i];
		return sum;
	}

	public static double addUp(double... arg1)
	{
		System.out.println("double method executed");
		double sum = 0;
		for(int i = 0; i < arg1.length; i++)
			sum+=arg1[i];
		return sum;
	}

	public static int addUp(String... arg1)
	{
		System.out.println("String method executed");
		int sum = 0;
		for(int i = 0; i < arg1.length; i++)
			sum+=toNumber(arg1[i]);
		return sum;
	}
	
//	public static int addUp(int arg1, int arg2)
//	{
//		System.out.println("int method executed");
//		return arg1+arg2;
//	}
//
//	public static double addUp(double arg1, double arg2)
//	{
//		System.out.println("double method executed");
//		return arg1+arg2;
//	}
//
//	public static int addUp(String arg1, String arg2)
//	{
//		System.out.println("String method executed");
//		return (toNumber(arg1)+toNumber(arg2));
//	}

	public static void main(String[] args) 
	{
		System.out.println(addUp(3.2, 2.2)); //invokes double method as both parameters are double
		System.out.println(addUp(1, 4)); //invokes int method as both paramters are int
		System.out.println(addUp("one", "three")); //invokes striing method as both parameters are string
		System.out.println(addUp(2, 3.5)); //invokes double as 2 can be considered as double but 3.5 cannot be considered as int, as there will be loss of precision
		//System.out.println(addUp(1, "three")); This method call takes int and String parameters
		//for which there is no defined method. Thus, giving a compilation error
		System.out.println(addUp(3.2));
		System.out.println(addUp("seven"));
		System.out.println(addUp(3));
		System.out.println(addUp(3.2,1,7.8));
		System.out.println(addUp(3,5,7,9));
		System.out.println(addUp("one", "six", "ten"));
		//System.out.println(addUp());//this method call would raise an ambigious situation
		//where compiler will be confused to invoke a appropriate method as all three
		//overloaded methods satisfies the empty parameter list condition
	}

}
