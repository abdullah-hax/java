class Bank {
	String accountHolder;
	double balance;

	public void deposit(double a) {
		balance = balance + a;
		System.out.println("Account Holder Name : " + accountHolder);
		System.out.println("Deposited " + a);
		System.out.println("---------------------------------------");

	}

	public void withdraw(double b) {
		System.out.println("Account Holder Name: " + accountHolder);
		if (balance >= b) {
			balance = balance - b;
			System.out.println("Withdraw Successfull");
			System.out.println("Current Balance is : " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
		System.out.println("---------------------------------------");

	}

}

public class BankTran {
	public static void main(String[] args) {

		Bank acc1 = new Bank();

		acc1.accountHolder = "Rakibul Islam";
		acc1.balance = 0;
		double a = 2500;
		acc1.deposit(a);
		double b = 500;
		acc1.withdraw(b);

	}
}



