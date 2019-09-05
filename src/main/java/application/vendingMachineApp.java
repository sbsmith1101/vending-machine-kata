package application;

import java.util.Scanner;

import balance.vendingMachine;


public class vendingMachineApp {

	public static void main(String[] args) {
	vendingMachine session = new vendingMachine();
	 String userChoice;
	   
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please select the item you want to purchase \n");
	    
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
	        	if(session.getBalance() >= 1.0) {
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
	        	if(session.getBalance() >= 0.5) {
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
	        	if(session.getBalance() >= 0.65) {
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
	        	if(session.getBalance() == 0.65) {
	        		graphics.candyGraphic();
	        		session.candy();
	        		break;
	        	}
	        	else {
	        		System.out.println("Please insert exact change");
	        		break;
	        	}
	        
	        	
	   
	        	
	        }
	        
	    }
	        while(!userChoice.contentEquals("7"));
	    if(session.getBalance() > 0.0) {
    		do {
    			if(session.getBalance() >= 5.0) {
    				graphics.returnFive();
    				session.fiveBillReturn();
    				
    			}
    			if(session.getBalance() < 5.0 && session.getBalance() >= 1.0 ) {
    				graphics.returnOne();
    				session.singleBillReturn();
    				
    			}
    			if(session.getBalance() < 1.0 && session.getBalance() >= 0.25 ) {
    				graphics.returnCoin();
    				session.quarterReturn();
    				
    			}
    			if(session.getBalance() < .25 && session.getBalance() >= 0.1 ) {
    				graphics.returnCoin();
    				session.dimeReturn();
    				
    			}
    			if(session.getBalance() < .1 && session.getBalance() >= 0.05 ) {
    				graphics.returnCoin();
    				session.nickelReturn();	
    			}
    			
    		
    		}
    		while(!(session.getBalance() == 0.0));
    	 System.out.println("Have A Nice Day!");
    		
  

    	}
	        
	
	    
}
	 private static void mainScreen() {
		 	System.out.println("- Enter 1 to enter coins");
	        System.out.println("- Enter 2 to purchase soda $1");
	        System.out.println("- Enter 3 to purchase chips $0.50");
	        System.out.println("- Enter 4 to purchase candy $0.65");
	        System.out.println("- Enter 5 to purchase gum ((( SOLD OUT)))");
	        System.out.println("- Enter 6 to purchase candy with exact change $0.65");
	        System.out.println("- Enter 7 to cancel purchase and return change");
	        
	     
	        
	    }
	
}
