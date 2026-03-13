package Oops;
class Account{
	private String id;
	private String name;
	private int balance;
	Account(String id,String name){
		this.id=id;
		this.name=name;
		balance=0;
	}
	Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	int credit(int amount) {
		
		return balance+=amount;
	}
	int debit(int amount) {
		if (amount > balance) { 
			System.out.println("Amount exceeded balance"); 
		} 
		else {
			balance -= amount; 
		} 
		return balance;
	}
	int transferTo(Account another, int amount) { 
		if (amount > balance) { 
			System.out.println("Amount exceeded balance"); 
		} 
		else { 
			this.balance -= amount; 
			another.balance += amount; 
		} 
		return balance; 
	}
	public String toString() {
		return id+name+balance;
	}
}
public class AccountMain {
   public static void main(String[] args) {
	   Account a1 = new Account("Sam ","abc_1 ");
	   Account a2 = new Account("Ram ","abc_2 ",1000);
	   a1.credit(50000);
	   a2.credit(30000);
	   a1.transferTo(a2, 20000);
	   System.out.println(a1);
	   System.out.println(a2);
   }
}
