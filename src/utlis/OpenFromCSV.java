package utlis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import data.holder.DataHolder;
import data.model.Book;
import data.model.Film;
import data.model.Item;
import data.model.Music;
import data.model.User;

public class OpenFromCSV {
	
	private static Map<Integer, User> users = DataHolder.getUsers();
	private static Set<Item> items = DataHolder.getItems();
	
	static String filename1 = "Users.csv";
	static String filename2 = "Items.csv";
	
	public static Map<Integer, User> readFromFileUser(){
		
		Path path = Paths.get(filename1);
		ArrayList<String> read = new ArrayList<String>();
		try {
			read = (ArrayList<String>) Files.readAllLines(path);
		} catch (IOException ex) {
			System.out.println("There is no file Users");
		}
		Map<Integer, User> users = toObject(read);
		return users;
		
	}
	

	public static Map<Integer, User> toObject(ArrayList<String> read) {
		
		for(String line : read) {
			String [] l = line.split(";");
			users.put(Integer.parseInt(l[0]), new User(l[1], l[2], l[3], l[4], l[5]));
		}
		return users;
	}

	
	public static Set<Item> readFromFileItems(){
		
		Path path = Paths.get(filename2);
		ArrayList<String> readItem = new ArrayList<String>();
		try {
			readItem = (ArrayList<String>) Files.readAllLines(path);
		} catch (IOException ex) {
			System.out.println("There is no file Items");
		}
		Set<Item> items = toObjectItem(readItem);
		return items;
		
	}
	

	public static Set<Item> toObjectItem(ArrayList<String> readItem) {
		
		for (String line : readItem) {
			String[] l = line.split(";");
			if (l[1].equals("BOOK")) {
				items.add(new Book(l[0], l[1], l[2], l[3], l[4], 
						Integer.parseInt(l[5]), Integer.parseInt(l[6]), null));
			} else if (l[1].equals("MUSIC")) {
				items.add(new Music(l[0], l[1], l[2], l[3], l[4], 
						Integer.parseInt(l[5]), null));
			} else if (l[1].equals("FILM")) {
				items.add(new Film(l[0], l[1], l[2], l[3], l[4], 
						Integer.parseInt(l[5]), null));
			}

		}
		return items;
	}
	
	
	
}
