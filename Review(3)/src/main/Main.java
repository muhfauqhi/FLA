package main;

import java.util.Scanner;
import java.util.Vector;

import bread.Bread;
import builder.BreadBuilder;
import ingredients.BananaFilling;
import ingredients.ChocolateFlavor;
import ingredients.CreamCheese;
import ingredients.Flavor;
import ingredients.PeanutButter;
import ingredients.PlainFlavor;
import ingredients.StrawberryFilling;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	//initiate bread
	Vector<Bread> breads = new Vector<>();
	
	void view(){
		System.out.println("Fresh Bread Available");
		System.out.println("=====================");
		for (Bread bread : breads) {
			System.out.println("Name: " + bread.getName());
			System.out.println("Price: " + 
					(bread.getFlavor().getPrice() + 
					bread.getFilling().getPrice() + 
					bread.getTopping().getPrice()));
		}
		System.out.println("=====================");
		System.out.println("Breads: " + breads.size());
	}
	
	public Main() {
		String flavor, filling, topping;
		do {
		view();
		
			do {
				System.out.print("Input Flavor [Chocolate|Plain]: ");
				flavor = scan.nextLine();
			} while (!flavor.equals("Chocolate") && !flavor.equals("Plain"));
			do {
				System.out.print("Input Filling [Banana|Strawberry]: ");
				filling = scan.nextLine();
			} while (!filling.equals("Banana") && !filling.equals("Strawberry"));
			do {
				System.out.print("Input Topping [Cream Cheese|Peanut Butter]: ");
				topping = scan.nextLine();
			} while (!topping.equals("Cream Cheese") && !topping.equals("Peanut Butter"));
			BreadBuilder builder = new BreadBuilder();
			if (flavor.equals("Chocolate")) {
				builder.setFlavor(new ChocolateFlavor());
			} else if (flavor.equals("Plain")) {
				builder.setFlavor(new PlainFlavor());
			}
			if (filling.equals("Banana")) {
				builder.setFilling(new BananaFilling());
			} else if (filling.equals("Strawberry")) {
				builder.setFilling(new StrawberryFilling());
			}
			if (topping.equals("Cream Cheese")) {
				builder.setTopping(new CreamCheese());
			} else if (topping.equals("Peanut Butter")) {
				builder.setTopping(new PeanutButter());
			}
			Bread bread = builder.getResult();
			bread.setName(bread.getFlavor().getName() + " Bread with " + bread.getFilling().getName() + " and "
					+ bread.getTopping().getName());
			for (int i = 0; i < 5; i++) {
				breads.add((Bread) bread.clone());
			} 
		} while (true);
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
