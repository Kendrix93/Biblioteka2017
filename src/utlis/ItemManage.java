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
	private static int number = 0;
	
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
		
		number = number + 1;
		id = "B" + number;
		
		items.add(new Book(id, type, name, author, company, year, pages, counter, null));
		
	}
	
	public static void addMusic() {
		
		String name, author, company, id, type = "MUSIC";
		int songsQuantity, counter;
		
		System.out.println("Name?");
		name = in.nextLine();
		System.out.println("Author?");
		author = in.nextLine();
		System.out.println("Company?");
		company = in.nextLine();
		System.out.println("How many songs?");
		songsQuantity = in.nextInt();
		System.out.println("How many of this cds");
		counter = in.nextInt();
		
		number = number + 1;
		id = "M" + number;
		
		items.add(new Music(id, type, name, author, company, songsQuantity, counter, null));
		
	}
	
	public static void addFilm() {
		
		String name, author, company, id, type = "FILM";
		int minuts, counter;
		
		System.out.println("Name?");
		name = in.nextLine();
		System.out.println("Author?");
		author = in.nextLine();
		System.out.println("Company?");
		company = in.nextLine();
		System.out.println("How many songs?");
		minuts = in.nextInt();
		System.out.println("How many of this films");
		counter = in.nextInt();
		
		number = number + 1;
		id = "F" + number;
		
		items.add(new Music(id, type, name, author, company, minuts, counter, null));
		
		
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
