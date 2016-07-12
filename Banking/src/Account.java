
public abstract class Account 
{
	private long balance;
	private String holderName;
	public Account(String holderName)
	{
		this.holderName = holderName;
	}
	
	public final void transaction(String message, long amount)
	{
		System.out.println("Holder's name: "+holderName);
		System.out.println("Transaction message :"+message);
		System.out.println("Amount: "+amount);
		balance = balance + amount;
	}
	
	public long getBalance()
	{
		return balance;
	}
	
	public abstract boolean deposit(long amount);
	
	public abstract boolean withdraw(long amount);
}

class CheckingAccount extends Account
{
	private long overdraftAmount;
	public CheckingAccount(String holderName, long overdraftAmount)
	{
		super(holderName);
		this.overdraftAmount = overdraftAmount;
	}
	
	public boolean deposit(long amount)
	{
		transaction("Checking Deposit", amount);
		return true;
	}
	public boolean withdraw(long amount)
	{
		if(amount > getBalance()+overdraftAmount)
			return false;
		else
		{
			transaction("Checking Withdrawal", amount*-1);
			return true;
		}
	}
}

class MortgageAccount extends Account
{
	private long amountBorrowed;
	public MortgageAccount(String holderName, long amountBorrowed)
	{
		super(holderName);
		this.amountBorrowed = amountBorrowed;
		System.out.println("Initial borrowed Amount: "+this.amountBorrowed);
	}
	
	public boolean deposit(long amount)
	{
		transaction("Mortgage Payment", amount);
		return true;
	}
	
	public boolean withdraw(long amount)
	{
		return false;
	}
}