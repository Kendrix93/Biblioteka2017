package data.model;

public class Music extends Item{
	
	private int songsQuantity;

	public Music(String id, String type, String name, String author, 
			String company, int songsQuantity, int counter, User user) {
		super(id, type, name, author, company, counter, user);
		// TODO Auto-generated constructor stub
		
		this.songsQuantity = songsQuantity;
		
	}

	public int getSongsQuantity() {
		return songsQuantity;
	}

	public void setSongsQuantity(int songsQuantity) {
		this.songsQuantity = songsQuantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + songsQuantity;
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
		Music other = (Music) obj;
		if (songsQuantity != other.songsQuantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CD [songsQuantity=" + songsQuantity + "]";
	}
	
	

}
