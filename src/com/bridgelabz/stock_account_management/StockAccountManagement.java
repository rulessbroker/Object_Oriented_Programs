package com.bridgelabz.stock_account_management;

import java.util.Scanner;

public class StockAccountManagement {
	
	int noOfStocks;
	String[] nameOfShare;
	int noOfShares;
	double sharePrice;
	double totoalSharePrice;
	double totalStockPrice;

	public void getStockAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of stocks: ");
		noOfStocks = sc.nextInt();
		System.out.println("Enter no shares: ");
		noOfShares = sc.nextInt();
		System.out.println("Enter share names with saparete by comma: ");
		nameOfShare = sc.next().split(",");
		System.out.println("Enter share price: ");
		sharePrice = sc.nextDouble();
		totoalSharePrice = sharePrice * noOfShares;
		System.out.println("Total value of each stock is " + totoalSharePrice);
		totalStockPrice = noOfStocks * totoalSharePrice;
		System.out.println("Total Stock Price is " + totalStockPrice);

	}

	public void getShareNames() {
		System.out.print("list of share names are : ");
		for (String str : nameOfShare) {
			System.out.print(str + " ");
		}
	}
}
