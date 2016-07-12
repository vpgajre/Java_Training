
public class Main {

	public static void main(String[] args) 
	{
		Account[] acc = {new MortgageAccount("Tom",100000), new CheckingAccount("Bob",200), new CheckingAccount("Harry",1000)};
		for(int i = 0; i < acc.length; i++)
		{
			System.out.println("Deposit 1000: " +acc[i].deposit(1000));
			System.out.println("Withdraw 500: " +acc[i].withdraw(500));
			System.out.println("Withdraw 1000: " +acc[i].withdraw(1000));
			System.out.println("Withdraw 2000: " +acc[i].withdraw(2000));
			System.out.println();
		}
	}
}
