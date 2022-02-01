
public class BankAccountClient {
	public static void main(String[] args){
	BankAccount b1=new BankAccount("account1", 3);
	b1.deposit(500.0);
	System.out.println(b1.toString());
	b1.withdraw(300.0);
	System.out.println(b1.toString());
	BankAccount b2=new BankAccount();
	//must initialize b2 or else methods won't work.
	System.out.println(b2.toString());
	b2.setName("account2");
	b2.setBalance(100.20);
	System.out.println(b2.toString());
	
	}
}
