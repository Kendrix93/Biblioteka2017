package data.holder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


import data.model.Item;
import data.model.User;

public class DataHolder {
	
	private static Map<String, User> users = new HashMap<>();
	private static Set<Item> items = new HashSet<>();

}
