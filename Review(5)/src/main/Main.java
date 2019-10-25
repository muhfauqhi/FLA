package main;

import java.util.Scanner;

import absent.Absent;
import absent.NewAbsent;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	
	public Main() {
		String name;
		
		System.out.println("Bluejack Bakery Employee System");
		System.out.println("===============================");
		System.out.print("Input Employee Name: ");
		name = scan.nextLine();
		
		Absent data = new Absent();
		data.setEmployeeName(name);
		
		NewAbsent newData = new NewAbsent(data);
		
		for (int i = 0; i < 25; i++) {
			System.out.println();
		}
		
		System.out.println("Absent Saved");
		System.out.println("============");
		System.out.println("Name: " + data.getEmployeeName());
//		old system no barbar
//		System.out.print("Time: " + data.getTimeInString());
		
//		old system barbar
//		System.out.print("Time: ");
//		data.printTime();
		
//		new system 
		System.out.print("Time: " + newData.getTimeInString());
		System.out.println();
		System.out.println("============");
		System.out.println("Press Enter to Continue...");
		scan.nextLine();

	}
	
	public static void main(String[] args) {
		new Main();
	}
}
