package utlis;

import java.util.Map;
import java.util.Scanner;
import data.holder.DataHolder;
import data.model.User;
import main.MainController;

public class Login {
	
	
	private static Map<Integer, User> users = DataHolder.getUsers();
	private static Scanner in = new Scanner(System.in);
	
	
	public static void LoginPanel() {

		System.out.println("Login: ");
		String login = in.next();
		System.out.println("Password: ");
		String password = in.next();

		for (int i = 1;; i++) {
			if (users.get(i) == null) {
				System.out.println("Wrong login or password");
				break;
			}else if ( users.get(i).getLogin().equals(login) && users.get(i).getPassword().equals(password)) {
				if (users.get(i).getTypeOfUser().equals("ADMIN")) {
					MainController.EmployyPanel();
				}else {
					MainController.UserPanel(i);
				}
			}
				
			
		}
		
		
	}
	

}
