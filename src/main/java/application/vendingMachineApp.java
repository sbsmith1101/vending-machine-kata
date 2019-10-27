package application;

import java.util.Scanner;

import balance.vendingMachine;


public class vendingMachineApp {

	public static void main(String[] args) {
	vendingMachine session = new vendingMachine();
	 String userChoice;
	   
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please select the item you want to purchase \n");
	    session.startDrawer();
	    do {
	        mainScreen();
	        System.out.println("Current Balance " + session.getBalance());
	        userChoice = input.nextLine();
	        switch(userChoice) {
	        case "1":
	        	System.out.println("select currency to add");
				System.out.println("Enter 1 for Nickel");
				System.out.println("Enter 2 for Dime");
				System.out.println("Enter 3 for Quarter");
				System.out.println("Enter 4 for $1 bill");
				System.out.println("Enter 5 for $5 bill");
				System.out.println("Enter 6 for Pennie");
				System.out.println("Enter 7 for Canadian Quarter");
				System.out.println("Enter anything else to return to main screen");
				String currencyToAdd = input.nextLine();
			
	        	if (currencyToAdd.equals("1")) {
	        		session.nickel();
	        	}
	        	if (currencyToAdd.equals("2")) {
	        		session.dime();
	        	}
	        	if (currencyToAdd.equals("3")) {
	        		session.quarter();
	        	}
	        	if (currencyToAdd.equals("4")) {
	        		session.singleBill();
	        	}
	        	if (currencyToAdd.equals("5")) {
	        		session.fiveBill();
	        	}
	        	if (currencyToAdd.equals("6")) {
	        		System.out.println("This Machine can only accept following curreny: nickel, dime, quarter, $1 bill, $5 bill");
	        	}
	        	if (currencyToAdd.equals("7")) {
	        		System.out.println("This Machine can only accept US currency");
	        	}
	        	
	        	else {
	        		break;
	        	}
	        	
	        	//soda
	        case "2":
	        	if(session.exactChangedNeeded() && session.getBalance() != 100 ) {
	        		System.out.println("exact change required");
	        		break;
	        	}
	        	else if(session.getBalance() >= 100) {
	        		graphics.sodaGraphic();
	        		session.soda();
	        		break;
	        	}
	        	else {
	        		System.out.println("Insufficent Funds");
	        		break;
	        	}
	        	//chips
	        case "3":
	        	if(session.exactChangedNeeded() && session.getBalance() != 50 ) {
	        		System.out.println("exact change required");
	        		break;
	        	}
	        	if(session.getBalance() >= 50) {
	        		graphics.chipsGraphic();
	        		session.chips();
	        		break;
	        	}
	        	else {
	        		System.out.println("Insufficent Funds");
	        		break;
	        	}
	        	//candy
	        case "4":
	        	if(session.exactChangedNeeded() && session.getBalance() != 65 ) {
	        		System.out.println("exact change required");
	        		break;
	        	}
	        	if(session.getBalance() >= 65) {
	        		graphics.candyGraphic();
	        		session.candy();
	        		break;
	        	}
	        	else {
	        		System.out.println("Insufficent Funds");
	        		break;
	        	}
	        case "5":
	        	System.out.println("Sorry this Item is Out of Stock");
	        	System.out.println("Please Choose another selection");
        		break;

	        case "6":
	     
	        	System.out.println("1 to empty drawer contents");
	        	System.out.println("2 to show drawer contents");
	        	System.out.println("Press any other key to return to main menu");
	        	userChoice = input.nextLine();
	        	switch(userChoice) {
	        	case "1":
	        	session.emptyDrawer();
	        	break;
	        	case "2":
	        	}
	        	session.showDrawer();
	        	break;
	   
	        	
	        }
	        
	    }
	        while(!userChoice.contentEquals("7"));
	    if(session.getBalance() > 0) {
    		do {
    			if(session.getBalance() >= 500 && session.bills[1] >= 1) {
    				graphics.returnFive();
    				session.fiveBillReturn();
    				
    			}
    			if(session.getBalance() < 500 && session.getBalance() >= 100 && session.bills[0] >=1 ) {
    				graphics.returnOne();
    				session.singleBillReturn();
    				
    			}
    			if(session.getBalance() < 100 && session.getBalance() >= 25 && session.coins[2] >=1 ) {
    				graphics.returnCoin();
    				session.quarterReturn();
    				
    			}
    			if(session.getBalance() < 25 && session.getBalance() >= 10 && session.coins[1] >=1 ) {
    				graphics.returnCoin();
    				session.dimeReturn();
    				
    			}
    			if(session.getBalance() < 10 && session.getBalance() >= 5 && session.coins[0] >=1 ) {
    				graphics.returnCoin();
    				session.nickelReturn();	
    			}
    			
    		System.out.println(session.getBalance());
    		}
    		while(session.getBalance() != 0);
    	 System.out.println("Have A Nice Day!");
    		
  

    	}
	        
	
	    
}
	 private static void mainScreen() {
		 	System.out.println("- Enter 1 to enter coins");
	        System.out.println("- Enter 2 to purchase soda $1");
	        System.out.println("- Enter 3 to purchase chips $0.50");
	        System.out.println("- Enter 4 to purchase candy $0.65");
	        System.out.println("- Enter 5 to purchase gum ((( SOLD OUT)))");
	        System.out.println("- Enter 6 Maintence options");
	        System.out.println("- Enter 7 to cancel purchase and return change");
	        
	     
	        
	    }
	
}
