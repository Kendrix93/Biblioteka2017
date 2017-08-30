package utlis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import data.holder.DataHolder;
import data.model.Item;
import data.model.User;

public class SaveToCSV {
	
	private static Map<Integer, User> users = DataHolder.getUsers();
	private static Set<Item> items = DataHolder.getItems();
	
	static String filename1 = "Users.csv";
	static String filename2 = "Items.csv";
	
	public static void saveToFileUser() {
		
		Path path = Paths.get(filename1);
		ArrayList<String> out = new ArrayList<>();
		for (int i = 1;; i++) {
			if (users.get(i) == null) {
				break;
			}
				out.add(i +";" + users.get(i).toFile(";"));
			
		}try {
			Files.write(path, out);
		}catch(IOException ex){
			System.out.println("Cant save file Users");
		}
		System.out.println("Done save to file User");
	}

}
