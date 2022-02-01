

public class BankAccount {
	private String name;
	private double balance;
	public BankAccount() {
		
	}
	public BankAccount(String n1, double b1) {
		setName(n1);
		setBalance(b1);
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public void withdraw(double amount) {
		balance=balance-amount;
	}
	public String toString() {
		return name + ", " + balance;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public boolean setName(String n) {
		if(n!=null) {
			name=n;
			return true;
		}
		else
			return false;
	}
	public boolean setBalance(double b) {
		balance=b;
		return true;
	}
}
