package data.holder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import data.model.Item;
import data.model.User;

public class DataHolder {
	
	private static Map<Integer, User> users = new HashMap<>();
	private static Set<Item> items = new HashSet<>();
	
	
	public static Map<Integer, User> getUsers() {
		return users;
	}
	public static void setUsers(Map<Integer, User> users) {
		DataHolder.users = users;
	}
	public static Set<Item> getItems() {
		return items;
	}
	public static void setItems(Set<Item> items) {
		DataHolder.items = items;
	}
	

	
}
