package utlis;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import data.holder.DataHolder;
import data.model.Item;
import data.model.User;

public class UserItemActions {
	
	private static Map<Integer, User> users = DataHolder.getUsers();
	private static Set<Item> items = DataHolder.getItems();
	private static Scanner in = new Scanner(System.in);
	
	
	public static void rentAnItem() {
		
		String itemID;
		int userID;
		
		System.out.println("Item ID:");
		itemID = in.next();
		System.out.println("UserID: ");
		userID = in.nextInt();
		
		for(Item i : items) {
			if(i.getId().equals(itemID)) {
				if (users.get(userID) == null) {
					System.out.println("Wrong user ID!!!");
					break;
				}
				i.setUserID(userID);
				System.out.println("You rent an item " + i.getName() + " to userID " + userID);
			}

		}

		
	}
	
	public static void returnItem() {
		
		System.out.println("What item you want to return");
		System.out.println("Write ItemID: ");
		String itemID = in.next();
		
		for(Item i : items) {
			if(i.getId().equals(itemID)) {
				i.setUserID(00);
				System.out.println("Done returnig item " + itemID + " " + i.getName());
			}
		}
	}

}
