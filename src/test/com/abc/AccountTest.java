package com.abc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    private static final double DOUBLE_DELTA = 1e-15;
    
    Account account = new Account(0);

    @Test
    public void testAccountTransactionSummary() {       
        account.deposit(1000);
        account.deposit(5000);
        account.withdraw(100);
        assertEquals(5900.00, account.sumTransactions(),DOUBLE_DELTA);
    }

    @Test
    public void testAccountType() {
    	Account account2 = new Account(1);
        assertEquals(Account.SAVINGS, account2.getAccountType());
    }

    
    @Test
    public void testInterestEarned() {
    	Account checking = new Account(0);
    	checking.deposit(4000);
    	checking.deposit(6000);
    	checking.interestEarned();
        assertEquals(1.0, checking.interestEarned(),DOUBLE_DELTA);
    }
    
}
