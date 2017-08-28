package data.model;

public class Book extends Item{
	
	int pages;

	public Book(String id, String type, String name, String author, 
			String company,int pages, int counter) {
		super(id, type, name, author, company, counter);
		// TODO Auto-generated constructor stub
		this.pages = pages;
		
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pages;
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
		return true;
	}

	@Override
	public String toString() {
		return "Book [pages=" + pages + "]";
	}
	
	

}
