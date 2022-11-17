package com.bridgelabz.stock_account_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.account_management.Account;

public class Portfolio {

	public static void buyShare() {
		
		Scanner sc = new Scanner(System.in);
		
		List<StockAccountManagement> stock = new ArrayList<>();
		
		System.out.println("Enter share name: ");
		String nameOfShare = sc.next();
		System.out.println("Enter no of shares: ");
		int noOfShares = sc.nextInt();
		System.out.println("Enter share price: ");
		double sharePrice = sc.nextDouble();
		System.out.println();
		double totalSharePrice = sharePrice * noOfShares;
		
		double amount = Account.totalBalance - totalSharePrice;
		
		
		StockAccountManagement data = new StockAccountManagement(nameOfShare, noOfShares, sharePrice, totalSharePrice);
		stock.add(data);
		
		System.out.println(amount);
		
		for(StockAccountManagement stockData : stock) {
			System.out.println(stockData);
		}
	}
}
