class Bank {

	String accountNumber;
	double balance;

	void deposit(double amount) {
		balance = balance + amount;

	}

	void withdraw(double amount) {
		balance = balance - amount;
	}

	public void displayBalance() {
		System.out.println("Account : " + accountNumber);
		System.out.println("Current balance = " + balance);
		System.out.println("---------------------------------");
	}
}

class BankMain {
	public static void main(String[] args) {

		Bank bAcc1 = new Bank();
		Bank bAcc2 = new Bank();

		bAcc1.accountNumber = "Abc123";
		bAcc1.balance = 12000;
		bAcc1.deposit(5000);
		bAcc1.withdraw(2000);

		bAcc1.displayBalance(); // non static k class die call kora jaina.

		bAcc2.accountNumber = "bcd234";
		bAcc2.balance = 65000;
		bAcc2.deposit(5000);
		bAcc2.withdraw(2000);

		bAcc2.displayBalance();
	}

}

// class er sate somporkito = static method
// object er sate somporkito = non static method