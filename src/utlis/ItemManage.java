package utlis;

import java.util.Scanner;
import java.util.Set;

import data.holder.DataHolder;
import data.model.Book;
import data.model.Item;
import data.model.Music;

public class ItemManage {
	
	private static Set<Item> items = DataHolder.getItems();
	private static Scanner in = new Scanner(System.in);
	private static int number1 = 0;
	private static int number2 = 0;
	private static int number3 = 0;
	
	public static void addBook() {
		
		String name, author, company, id, type = "BOOK";
		int year, pages, counter;
		
		System.out.println("Name?");
		name = in.nextLine();
		System.out.println("Author?");
		author = in.nextLine();
		System.out.println("Company?");
		company = in.nextLine();
		System.out.println("Year of production?");
		year = in.nextInt();
		System.out.println("How many pages?");
		pages = in.nextInt();
		System.out.println("How many of this books");
		counter = in.nextInt();
		in.nextLine();
		
		for (Item i : items) {
			if(i.getType().equals("BOOK"))
				number1++;
		}
		
		for (int i =1; i <= counter ; i++) {
		
		number1 = number1 + 1;
		id = "B" + number1;
		
		items.add(new Book(id, type, name, author, company, year, pages, null));
		System.out.println("DONE");
		}
	}
	
	public static void addMusic() {
		
		String name2, author, company, id, type = "MUSIC";
		int songsQuantity, counter;
		
		System.out.println("Name?");
		name2 = in.nextLine();
		System.out.println("Author?");
		author = in.nextLine();
		System.out.println("Company?");
		company = in.nextLine();
		System.out.println("How many songs?");
		songsQuantity = in.nextInt();
		System.out.println("How many of this cds");
		counter = in.nextInt();
		in.nextLine();
		

		for (Item i : items) {
			if(i.getType().equals("MUSIC"))
				number1++;
		}
		
		for (int i =1; i <= counter ; i++) {
		
		number2 = number2 + 1;
		id = "M" + number2;
		
		items.add(new Music(id, type, name2, author, company, songsQuantity, null));
		System.out.println("DONE");
		}
	}
	
	public static void addFilm() {
		
		String name3, author, company, id, type = "FILM";
		int minuts, counter;
		
		System.out.println("Name?");
		name3 = in.nextLine();
		System.out.println("Author?");
		author = in.nextLine();
		System.out.println("Company?");
		company = in.nextLine();
		System.out.println("How many minutes?");
		minuts = in.nextInt();
		System.out.println("How many of this films");
		counter = in.nextInt();
		in.nextLine();
		

		for (Item i : items) {
			if(i.getType().equals("FILM"))
				number1++;
		}
		
		for (int i =1; i <= counter ; i++) {
		
		number3 = number3 + 1;
		id = "F" + number3;
		
		items.add(new Music(id, type, name3, author, company, minuts, null));
		System.out.println("DONE");
		}
		
	}
	
	
	public static void showAllItems() {
		
		for (Item a: items) {
			System.out.println(a);
		}
	}
	
	
	public static void deleteItem() {
		
		System.out.println("Write an ID of item you want to delete");
		String ID = in.nextLine();
		for (Item a: items) {
			if(a.getId().equals(ID))
				items.remove(a);
		}
	}
	

}
