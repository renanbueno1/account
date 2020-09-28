package entities;

public class Account {
	
	private Integer number;/*The access modifier private is to
	use in this class Account only*/
	private String holder;
	protected Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) { /* I will declare the argument amount,
	cause it will remove a quantity on the amount*/
		balance -= amount;
	}
	public void deposit(double amount) { /* I will declare the argument amount,
	cause it will add a quantity on the amount*/
		balance += amount;
	}

}
