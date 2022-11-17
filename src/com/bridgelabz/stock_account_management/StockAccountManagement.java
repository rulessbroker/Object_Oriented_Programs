package com.bridgelabz.stock_account_management;

import java.util.Scanner;

public class StockAccountManagement {

	private String nameOfShare;
	private int noOfShares;
	private double sharePrice;
	private double totalSharePrice;

	public StockAccountManagement(String nameOfShare, int noOfShares, double sharePrice, double totalSharePrice) {
		this.nameOfShare = nameOfShare;
		this.noOfShares = noOfShares;
		this.sharePrice = sharePrice;
		this.totalSharePrice = totalSharePrice;
	}

	@Override
	public String toString() {
		return "name Of Share is " + nameOfShare + ".\nno Of Shares are " + noOfShares + ""
				+ ".\nsingle share Price is "
				+ sharePrice + ".\ntotal Share Price is " + totalSharePrice;
	}

}
