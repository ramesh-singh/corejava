package com.mypackage.main;

import com.mypackage.model.Account;
import com.mypackage.service.AccountService;

public class AppMain {
	public static void main(String[] args) {
		AccountService accountService= new AccountService(new Account(50));
		Thread husband= new Thread(){
			public void run(){
				try {
					for(int i=0; i<10; i++)
						accountService.withdraw(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};

		Thread wife= new Thread(){
			public void run(){
				try {
					for(int i=0; i<10; i++)
						accountService.withdraw(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		
		husband.setName("husband");
		husband.start();
		
		wife.setName("wife");
		wife.start();

	}

}
