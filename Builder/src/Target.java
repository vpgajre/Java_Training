
public class Target 
{
	private String fieldA;
	private String fieldB;
	private String fieldC;
	private int fieldD;
	private int fieldE;

	private Target(NestedBuilder nb)
	{
		this.fieldA = nb.fieldA;
		this.fieldB = nb.fieldB;
		this.fieldC = nb.fieldC;
		this.fieldD = nb.fieldD;
		this.fieldE = nb.fieldE;
	}

	private boolean validate(NestedBuilder nb) throws ValidateException
	{
		try
		{
			if(nb.fieldA == null)
			{
				throw new ValidateException();
			}
			else if(nb.fieldB == null && nb.fieldC == null)
			{
				throw new ValidateException();
			}
			else if(nb.fieldD < nb.fieldE)
			{
				throw new ValidateException();
			}
			return true;
		}
		catch(Exception e)
		{
			throw new ValidateException();
		}
	}

	public String getFieldA() 
	{
		return fieldA;
	}

	public String getFieldB() 
	{
		return fieldB;
	}

	public String getFieldC() 
	{
		return fieldC;
	}

	public int getFieldD() 
	{
		return fieldD;
	}

	public int getFieldE() 
	{
		return fieldE;
	}

	public static class NestedBuilder
	{
		private String fieldA;
		private String fieldB;
		private String fieldC;
		private int fieldD;
		private int fieldE;
		private Target target;

		private NestedBuilder(String fieldA)
		{
			this.fieldA = fieldA;
		}

		public NestedBuilder setFieldA(String fieldA)
		{
			this.fieldA = fieldA;
			return this;
		}

		public NestedBuilder setFieldB(String  fieldB)
		{
			this.fieldB = fieldB;
			return this;
		}

		public NestedBuilder setFieldC(String fieldC)
		{
			this.fieldC = fieldC;
			return this;
		}

		public NestedBuilder setFieldD(int  fieldD)
		{
			this.fieldD = fieldD;
			return this;
		}

		public NestedBuilder setFieldE(int  fieldE)
		{
			this.fieldE = fieldE;
			return this;
		}

		public Target build()
		{
			target = new Target(this);
			boolean result = false;
			try
			{
			 result = target.validate(this);
			}
			catch(ValidateException e)
			{
				System.out.println(e);
			}
			if(result)
				return target;
				return null;
		}

		@Override
		public String toString() {
			return "NestedBuilder [fieldA=" + fieldA + ", fieldB=" + fieldB + ", fieldC=" + fieldC + ", fieldD="
					+ fieldD + ", fieldE=" + fieldE + "]";
		}

		public static NestedBuilder factory(String fieldA)
		{
			return new NestedBuilder(fieldA);
		}
	}


}

class ValidateException extends Exception
{
	public ValidateException() 
	{	
		super("Invalid data");
	}
}