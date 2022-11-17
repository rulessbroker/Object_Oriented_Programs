package com.bridgelabz.commercial_data_processing;

import java.util.ArrayList;

import com.bridgelabz.account_management.Account;

import com.bridgelabz.stock_account_management.Portfolio;

public class StockAccount {
		
	ArrayList<Portfolio> stock = new ArrayList<>();
	int amount = 0;
	
	public double valueOf() {
		Account.addAmount(amount);
		return amount;
	}
	
	public void buy() {
		Portfolio.buyShare();
	}
	
	public void printReport() {
		for(Portfolio report : stock) {
			System.out.println(report);
		}
	}
}
