package data.model;

public class Film extends Item {
	
	private int minuts;

	public Film(String id, String type, String name, String author, 
			String company, int minuts, int userID) {
		super(id, type, name, author, company, userID);
		// TODO Auto-generated constructor stub
		
		this.minuts = minuts;
	}

	public int getMinuts() {
		return minuts;
	}

	public void setMinuts(int minuts) {
		this.minuts = minuts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + minuts;
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
		Film other = (Film) obj;
		if (minuts != other.minuts)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Film [getId()=" + getId() + ", getType()=" + getType() + ", getName()=" + getName() + ", getAuthor()="
				+ getAuthor() + ", getCompany()=" + getCompany() + ", getUserID()=" + getUserID() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", minuts=" + minuts + "]";
	}


	
	@Override
	public String toFile(String separator) {
		
		return getId() + separator + getType() + separator + getName() + separator + getAuthor() 
		+ separator + getCompany() + separator + getMinuts() + separator + getUserID();
	}

}
