package Encapsulation;

public class ATM {

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.updatepin(123456, 1234, 3333);
		obj.withdraw(123456, 3333, 1000);

	}

}
