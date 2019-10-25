package main;

import java.util.Scanner;
import java.util.Vector;

import breads.Bread;
import factories.BananaMilk;
import factories.BreadFactory;
import factories.ChocolateCheese;

public class Main {
	Scanner scan = new Scanner(System.in);
	Vector<Bread> breads = new Vector<>();
	
	void list(){
		System.out.println("Total Breads: " + breads.size());
		System.out.println("==============");
		System.out.println("List of Breads:");
		for (int i = 0; i < breads.size(); i++) {
			System.out.println(i+1 + breads.get(i).getName());
		}
		System.out.println("==============");
	}
	
	public Main() {
		list();
		BreadFactory aFactory;
		int input;
		
		do {
			System.out.println("Create New Bread");
			System.out.println("1. Chocolate Cheese Special");
			System.out.println("2. Banana Milk Special");
			System.out.println("3. Exit");
			System.out.print("Input Choice: ");
			input = scan.nextInt();
			scan.nextLine();
			
			switch(input){
			case 1:
				breads = aFactory.getFilling();
				
				break;
			case 2:
				aFactory = new BananaMilk();
				break;
			}
		} while (input!=3);
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
