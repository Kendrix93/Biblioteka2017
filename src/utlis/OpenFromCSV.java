package utlis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import data.holder.DataHolder;
import data.model.Item;
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

}
