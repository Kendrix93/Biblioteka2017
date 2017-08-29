package utlis;

import java.util.Map;
import java.util.Scanner;

import data.holder.DataHolder;
import data.model.User;

public class UserManage {
	
	private static Map<Integer, User> users = DataHolder.getUsers();
	
	private static Scanner in = new Scanner(System.in);
	
	private static int number = 0;
	
	public static void adduser() {

		String name, surname, login, password, userType = "non";
		int i;

		System.out.println("Name");
		name = in.next();
		System.out.println("Surname");
		surname = in.next();
		System.out.println("Login");
		login = in.next();
		System.out.println("Password");
		password = in.next();
		System.out.println("Type of user");
		System.out.println("1.User");
		System.out.println("2.Admin");
		for (int a = 0; a <= 0;) {
			i = in.nextInt();
			if (i == 1) {
				userType = "USER";
				a++;
			} else if (i == 2) {
				userType = "ADMIN";
				a++;
			} else {
				System.out.println("Wrong number!!!");
			}
		}

		number = number + 1;

		users.put(number, new User(name, surname, login, password, userType));
		
		System.out.println("DONE");

	}
	
	public static void showUsers() {
		
		for (int i = 1;; i++) {
			if (users.get(i) == null) {
				break;
			}
				System.out.println(users.get(i));
			
		}

		
		
	}
	
	

}
