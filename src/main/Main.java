package main;

import utlis.Login;
import utlis.OpenFromCSV;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OpenFromCSV.readFromFileUser();
		OpenFromCSV.readFromFileItems();
		Login.LoginPanel();
		//MainController.EmployyPanel();

	}

}
