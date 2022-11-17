package com.bridgelabz.account_management;

import java.util.Scanner;

public class Account {

	static Scanner sc = new Scanner(System.in);
	public static int totalBalance = 0;

	public void debit() {
		System.out.println("Enter amount you can withdrawn : ");
		int withDrawn = sc.nextInt();
		if (totalBalance < withDrawn) {
			System.out.println("insufficient balance in your account. Main balance is : " + totalBalance);
		} else {
			totalBalance -= withDrawn;
			System.out.println("your total balance is : " + totalBalance);
		}
	}

	public static void addAmount(int addAmount) {
		System.out.println("Enter amount you can Add : ");
		addAmount = sc.nextInt();
		totalBalance += addAmount;
		System.out.println("your total balance is : " + totalBalance);
	}
}
