package Encapsulation;

//encapsulation is data binding. we will be binding all the reusable variables or method at one place
//In the below example we created 2 classes bank and atm. All the required methods and variables are created in bank class
//We used these variables in the ATM class, by defining bank obj
//We can use getter and setter in the encapsulation. we can use it directly from siurce and select generate getter and setter.

public class Bank {
	
	public int accountno = 123456;
	private int pinno = 1234;
	private double balance = 10000000;
	
	public void withdraw(int accno,int pin,int amount) {
		if(accno==accountno && pin==pinno) {
			
			if(amount<=balance) {
				balance = balance-amount;
				System.out.println("amount withdraw: "+ amount);
			}else {
				System.out.println("Insufficient Funds!!");
			}
		}else {
			System.out.println("Invalid credentials");
		}
	}
	
	public void updatepin(int accno, int oldpin, int newpin) {
		if(accno == accountno && oldpin == pinno) {
			pinno = newpin;
			System.out.println("pin changed successfully");
			
		}else {
			System.out.println("Invalid credentials");
		}
	}
	
	public double debitcash(int accno, int pin, double cash) {
		
		if(accno == accountno & pin == pinno ) {
			
			balance= balance+cash;
			System.out.println("total amoubt aftrer deposit" + balance);
			return balance;
			
		}else {
			System.out.println("invalid creds");
			return balance;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setPinno(int pinno) {
		this.pinno = pinno;
	}

}
