package ex02_baker;

import java.util.Scanner;

public class Voucher {
	final int breadCost = 200;

	int breads;
	int percentOff;
	String name;
	int total;
	int totalOutOff;

	void loadInfo() {
		Scanner read = new Scanner(System.in);

		System.out.print("Customer name: ");
		name = read.nextLine();
		System.out.print("Amount of breads: ");
		breads = read.nextInt();

		read.close();
	}

	void calculate() {
		if (breads >= 500) {
			percentOff = 30;
		} else {
			if (breads >= 300) {
				percentOff = 20;
			} else {
				if (breads >= 100) {
					percentOff = 10;
				}
			}
		}
		total = breads * breadCost;
		totalOutOff = total;
		total -= total * percentOff / 100;

	}

	void printVoucher() {
		System.out.println("===========================================");
		System.out.println("              Bakery Voucher               ");
		System.out.println("===========================================");
		System.out.println("  Customer:               " + name);
		System.out.println("  Amount of breads:       " + breads);
		System.out.println("  Percent off:            " + percentOff + "%");
		System.out.println("  Total without discount: " + totalOutOff + "$");
		System.out.println("  ---------------------------------------  ");
		System.out.println("  Total charged:          " + total + "$");
		System.out.println("===========================================");

	}
}
