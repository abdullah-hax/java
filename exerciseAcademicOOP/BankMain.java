class Bank{

	String accountNumber;
	double balance;
	
	void deposit(double amount){
		balance = balance + amount;
		
	}

	void withdraw(double amount){
		balance = balance - amount;
	}


		
	public void displayBalance(){
		System.out.println("Current balance = " + balance);
	}
}

class BankMain{
	public static void main(String[] args){

		Bank bAccount1 = new Bank();
		Bank bAccount2 = new Bank();


		bAccount1.accountNumber = "Abc123";
		bAccount1.balance = 12000;
		bAccount1.deposit(5000);
		bAccount1.withdraw(2000);

		bAccount1.displayBalance(); // non static k class die call kora jaina.


		bAccount2.accountNumber = "bcd234";
		bAccount2.balance = 65000;
		bAccount2.deposit(5000);
		bAccount2.withdraw(2000);

		bAccount2.displayBalance();
	}

}

// class er sate somporkito = static method
// object er sate somporkito = non static method

