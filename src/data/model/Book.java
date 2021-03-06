package data.model;

public class Book extends Item{
	
	private int pages;
	private int year;

	public Book(String id, String type, String name, String author, 
			String company, int year, int pages, int userID) {
		super(id, type, name, author, company,  userID);
		// TODO Auto-generated constructor stub
		this.year = year;
		this.pages = pages;
		
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pages;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (pages != other.pages)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [getId()=" + getId() + ", getType()=" + getType() + ", getName()=" + getName() + ", getAuthor()="
				+ getAuthor() + ", getCompany()=" + getCompany() + ", getUserID()=" + getUserID() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", pages=" + pages + ", year=" + year + "]";
	}

	@Override
	public String toFile(String separator) {
		
		return getId() + separator + getType() + separator + getName() + separator + getAuthor() 
		+ separator + getCompany() + separator + getYear() 
		+ separator + getPages() + separator + getUserID() ;
	}

	

}
