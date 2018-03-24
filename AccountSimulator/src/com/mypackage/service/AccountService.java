package com.mypackage.service;

import com.mypackage.model.Account;

public class AccountService {
	private Account account;
	
	public AccountService(Account account) {
		this.account= account;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public synchronized void withdraw(int amount) throws InterruptedException{
		
		if(account.getBalance()< amount){
			System.out.println("unsufficient balance in account.");
		}else{
			if(account.getBalance()> 0){
				System.out.println(Thread.currentThread().getName()+ "withdrawing");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" withdrew.");
				account.withdraw(amount);
				System.out.println("balance: "+account.getBalance());
			}else{
				System.out.println("Account overdrawn.");
				System.out.println("balance: "+account.getBalance());
			}
		}
	}

}
