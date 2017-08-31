package main;

import java.util.Scanner;

import utlis.ItemManage;
import utlis.SaveToCSV;
import utlis.UserManage;

public class MainController {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void EmployyPanel() {
		
		System.out.println("Welcome to MAIN MANU");
		System.out.println("Choose your option:");
		System.out.println("1. Rent a book");
		System.out.println("2. Rent a Music");
		System.out.println("3. Rent a Film");
		System.out.println("4. Return item");
		System.out.println("5. Add book");
		System.out.println("6. Add Music");
		System.out.println("7. Add film");
		System.out.println("8. Delete Item");
		System.out.println("9. Show all items");
		System.out.println("10. Add User");
		System.out.println("11. Delete User ");
		System.out.println("12. Show users ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("0. Quit");
		
		int a = in.nextInt();
		
		switch(a) {
		
		case 1:
			
		case 2:
			
		case 5:
			ItemManage.addBook();
			EmployyPanel();
		case 6:
			ItemManage.addMusic();
			EmployyPanel();
		case 7:
			ItemManage.addFilm();
			EmployyPanel();
		case 8:
			ItemManage.deleteItem();
			EmployyPanel();
		case 9:
			ItemManage.showAllItems();
			EmployyPanel();
		case 10:
			UserManage.adduser();
			SaveToCSV.saveToFileUser();
			EmployyPanel();
		case 12:
			UserManage.showUsers();
			EmployyPanel();
		case 0:
			SaveToCSV.saveToFileItems();
			System.exit(0);
			
			
			}
		
		
	}
	
	public static void UserPanel() {
		
		System.out.println("Welcome to MAIN MANU");
		System.out.println("Choose your option:");
		System.out.println("1. Show your items");
		System.out.println("2. Search for item");
		System.out.println("3. ");
		System.out.println("0. Quit");
		
		int a = in.nextInt();
		
		switch(a) {
		
		case 1:
			
		}
		
		
	}

}
