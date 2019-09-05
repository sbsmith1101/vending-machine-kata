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
	double bal = underTest.getBalance();
	}
	
	@Test
	public void vendingMachineShouldHaveBalanceOf0() {
		vendingMachine underTest = new vendingMachine();
		double bal = underTest.getBalance();
		assertThat(bal, is(0.0));
	}
	@Test
	public void vendingMachineShouldHaveNickelMethodsWhichIncreaseBalanceByFiveCents() {
		vendingMachine underTest = new vendingMachine();
		underTest.nickel();
		double bal1 = underTest.getBalance();
		assertThat(bal1, is(0.05));		
	}
	@Test
	public void vendingMachineShouldHaveDimeMethodsWhichIncreaseBalanceByTenCents() {
		vendingMachine underTest = new vendingMachine();
		underTest.dime();
		double bal = underTest.getBalance();
		assertThat(bal, is(0.1));		
	}
	@Test
	public void vendingMachineShouldHaveQuarterMethodsWhichIncreaseBalanceBy25Cents() {
		vendingMachine underTest = new vendingMachine();
		underTest.quarter();
		double bal = underTest.getBalance();
		assertThat(bal, is(0.25));		
	}
	@Test
	public void vendingMachineShouldHaveDollarMethodWhichIncreaseBalance() {
		vendingMachine underTest = new vendingMachine();
		underTest.singleBill();
		double bal = underTest.getBalance();
		assertThat(bal, is(1.00));		
	}
	@Test
	public void vendingMachineShouldHaveFiveBillMethodsWhichIncreaseBalance() {
		vendingMachine underTest = new vendingMachine();
		underTest.fiveBill();
		double bal = underTest.getBalance();
		assertThat(bal, is(5.00));		
	}
	@Test
	public void vendingMachineShouldHaveChipsWhichLowersBalanceBy50Cents() {
		vendingMachine underTest = new vendingMachine();
		underTest.chips();
		double bal = underTest.getBalance();
		assertThat(bal, is(-.5));		
	}
	@Test
	public void vendingMachineShouldHaveSodaWhichLowersBalanceBy1Dollar() {
		vendingMachine underTest = new vendingMachine();
		underTest.soda();
		double bal = underTest.getBalance();
		assertThat(bal, is(-1.0));		
	}
	@Test
	public void vendingMachineShouldHaveCandyWhichLowersBalanceBy65Cents() {
		vendingMachine underTest = new vendingMachine();
		underTest.candy();
		double bal = underTest.getBalance();
		assertThat(bal, is(-.65));		
	}
	
	
	
	
	
	
	
}
