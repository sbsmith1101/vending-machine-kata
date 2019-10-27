package balance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class vendingTest {
	
	@Test
	public void vendingMachineShouldExsist() {
	vendingMachine underTest = new vendingMachine();
	}
	
	
	@Test
	public void vendingMachineShouldHaveGetBalance() {
	vendingMachine underTest = new vendingMachine();
	int bal = underTest.getBalance();
	}
	
	@Test
	public void vendingMachineShouldHaveBalanceOf0() {
		vendingMachine underTest = new vendingMachine();
		int bal = underTest.getBalance();
		assertThat(bal, is(0));
	}
	@Test
	public void vendingMachineShouldHaveNickelMethodsWhichIncreaseBalanceByFiveCents() {
		vendingMachine underTest = new vendingMachine();
		underTest.nickel();
		int bal1 = underTest.getBalance();
		assertThat(bal1, is(5));		
	}
	@Test
	public void vendingMachineShouldHaveDimeMethodsWhichIncreaseBalanceByTenCents() {
		vendingMachine underTest = new vendingMachine();
		underTest.dime();
		int bal = underTest.getBalance();
		assertThat(bal, is(10));		
	}
	@Test
	public void vendingMachineShouldHaveQuarterMethodsWhichIncreaseBalanceBy25Cents() {
		vendingMachine underTest = new vendingMachine();
		underTest.quarter();
		int bal = underTest.getBalance();
		assertThat(bal, is(25));		
	}
	@Test
	public void vendingMachineShouldHaveDollarMethodWhichIncreaseBalance() {
		vendingMachine underTest = new vendingMachine();
		underTest.singleBill();
		int bal = underTest.getBalance();
		assertThat(bal, is(100));		
	}
	@Test
	public void vendingMachineShouldHaveFiveBillMethodsWhichIncreaseBalance() {
		vendingMachine underTest = new vendingMachine();
		underTest.fiveBill();
		int bal = underTest.getBalance();
		assertThat(bal, is(500));		
	}
	@Test
	public void vendingMachineShouldHaveChipsWhichLowersBalanceBy50Cents() {
		vendingMachine underTest = new vendingMachine();
		underTest.chips();
		int bal = underTest.getBalance();
		assertThat(bal, is(-50));		
	}
	@Test
	public void vendingMachineShouldHaveSodaWhichLowersBalanceBy1Dollar() {
		vendingMachine underTest = new vendingMachine();
		underTest.soda();
		int bal = underTest.getBalance();
		assertThat(bal, is(-100));		
	}
	@Test
	public void vendingMachineShouldHaveCandyWhichLowersBalanceBy65Cents() {
		vendingMachine underTest = new vendingMachine();
		underTest.candy();
		int bal = underTest.getBalance();
		assertThat(bal, is(-65));		
	}
	
	
	
	
	
	
}
