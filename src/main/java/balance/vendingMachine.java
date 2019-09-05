package balance;

public class vendingMachine {

	private double balance = 0.00;

	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void nickel() {
		 balance = balance + .050;
		
		
	}
	public void nickelReturn() {
		 balance = balance - .050;
	
		
	}
	

	public void dime() {
		balance = balance + .10;
		
	}
	public void dimeReturn() {
		balance = balance - .10;
		
	}

	public void quarter() {
		balance = balance + .250;
		
	}
	public void quarterReturn() {
		balance = balance - .250;
		
	}

	public void singleBill() {
		balance = balance + 1.0;
		
	}
	public void singleBillReturn() {
		balance = balance - 1.0;
		
	}

	public void fiveBill() {
		balance = balance + 5.0;
		
	}
	public void fiveBillReturn() {
		balance = balance - 5.0;
		
	}
	
	public void chips() {
		balance = balance - .50;
	}
	public void soda() {
		balance = balance - 1.0;
	}
	public void candy() {
		balance = balance - .650;
	}
	
	
	
}
