package data.model;

public abstract class Item {

	String id;
	String type;
	String name;
	String author;
	String company;
	int counter;
	
	public Item(String id, String type, String name, String author, String company, int counter){
		this.id = id;
		this.type = type;
		this.name = name; 
		this.author = author;
		this.company = company;
		this.counter = counter;
		
	}
	
	
	
	
}
