package main;

import java.util.Scanner;

import factories.BreadFactory;
import storages.Storage;

public class Main {
	Storage storage = Storage.getInstance();
	Scanner scan = new Scanner(System.in);
	
	void init_storage(){
		storage.setCurrBanana(10);
		storage.setCurrChocolate(10);
		storage.setCurrStrawberry(10);
	}
	
	void display_storage(){
		System.out.println("==========================");
		System.out.println("Welcome to Bluejack Bakery");
		System.out.println("==========================\n");
		
		System.out.println("Storage Status");
		System.out.println("--------------");
		System.out.println("Chocolate: " + storage.getCurrChocolate());
		System.out.println("Strawberry: " + storage.getCurrStrawberry());
		System.out.println("Banana: " + storage.getCurrBanana());
		System.out.println();
		System.out.println("Fresh Bread Stock");
		System.out.println("-----------------");
		System.out.println("Chocolate Bread: " + storage.getChocolateBread().size());
		System.out.println("Strawberry Bread: " + storage.getStrawberryBread().size());
		System.out.println("Banana Bread: " + storage.getBananaBread().size());
		System.out.println("==========================");
		
	}
	
	public Main() {
		init_storage();
		do {
			display_storage();
			String type;
			do {
				System.out.print("Input Bread to Bake [Chocolate|Strawberry|Banana]: ");
				type = scan.nextLine();
			} while (!type.equals("Chocolate") && !type.equals("Strawberry") && !type.equals("Banana"));
			BreadFactory factory = new BreadFactory();
			factory.createBread(type);
			for(int i=0;i<=25;i++){
				System.out.println();
			}
		} while (true);
	}
	
	public static void main(String[] args) {
		new Main();
		
	}
	
}
