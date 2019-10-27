package balance;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class vendingMachine {
	
	
		
//			nickels, dimes, quarters
			public int coins[] = new int[] {0,0,0};
			
		
//			$1, $5
			public int bills[] = new int [] {0,0};
			
	
	public void startDrawer() {
		coins[0] = 10;
		coins[1] = 20;
		coins[2] = 40;
		bills[0] = 20;
		bills[1] = 0;
			}
	
	public boolean exactChangedNeeded() {
		if(coins[0] <=2 || coins[1] <=2 || coins[2] <=2) {
			return true;
		}
		else {
		return false;
		}
		
	}

	private int balance = 0;

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	public String showDrawer() {
		 
		 System.out.println("coins:" +coins[0] +","+ coins[1] +","+ coins[2]);
		 System.out.println("bills:" +bills[0] +","+ bills[1]);
		return null;
		
	}
	

	public void nickel() {
		 balance = balance + 5;
		coins[0]++;
		
		
	}
	public void nickelReturn() {
		 balance = balance - 5;
		 coins[0]--;
		
	}
	

	public void dime() {
		balance = balance + 10;
		coins[1]++;
		
	}
	public void dimeReturn() {
		balance = balance - 10;
		coins[1]--;
	}

	public void quarter() {
		balance = balance + 25;
		coins[2]++;
	}
	public void quarterReturn() {
		balance = balance - 25;
		coins[2]--;
	}

	public void singleBill() {
		balance = balance + 100;
		bills[0]++;
	}
	public void singleBillReturn() {
		balance = balance - 100;
		bills[1]--;
	}

	public void fiveBill() {
		balance = balance + 500;
		bills[1]++;
	}
	public void fiveBillReturn() {
		balance = balance - 500;
		bills[1]++;
	}
	
	public void chips() {
		balance = balance - 50;
	}
	public void soda() {
		balance = balance - 100;
	}
	public void candy() {
		balance = balance - 65;
	}

	public void emptyDrawer() {
		coins[0] = 0;
		coins[1] = 0;
		coins[2] = 0;
		bills[0] = 0;
		bills[1] = 0;
		
		
	}
	
	
	
}
