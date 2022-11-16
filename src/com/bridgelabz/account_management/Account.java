package com.bridgelabz.account_management;

import java.util.Scanner;

public class Account {

	int totalBalance = 0;
	Scanner sc = new Scanner(System.in);

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

	public void addAmount() {
		System.out.println("Enter amount you can Add : ");
		int addamount = sc.nextInt();
		totalBalance += addamount;
		System.out.println("your total balance is : " + totalBalance);
	}
}
