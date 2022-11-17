package com.bridgelabz.commercial_data_processing;

import java.util.Scanner;

public class StockAccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add money\n2.Buy share\n3.Print Report\n4.Terminate");
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();

		StockAccount sa = new StockAccount();

		do {
			switch (choice) {
			case 1:
				sa.valueOf();
				break;
			case 2:
				sa.buy();
				break;
			case 3:
				sa.printReport();
				break;
			case 4:
				System.out.println("Terminated");
				break;
			default:
				System.out.println("Enter valid choice...");
			}
		}while (choice != 4);
	}
}
