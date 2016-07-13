public class Main 
{
	public static void main(String[] args)
	{
		Target.NestedBuilder nb = Target.NestedBuilder.factory("Test");
		nb.setFieldB("Test2");
		nb.setFieldD(20);
		nb.setFieldE(24);
		nb.build();
		System.out.println(nb);
	}
}
