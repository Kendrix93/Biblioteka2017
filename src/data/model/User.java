package data.model;

public class User {
	
	private String name;
	private String surname;
	private String login;
	private String password;
	private String typeOfUser;

	
	public User (String name, String surname, String login, String password, 
			String typeOfUser) {
		this.name = name;
		this.surname = surname;
		this.login = login;
		this.password = password;
		this.typeOfUser = typeOfUser;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTypeOfUser() {
		return typeOfUser;
	}


	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((typeOfUser == null) ? 0 : typeOfUser.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (typeOfUser == null) {
			if (other.typeOfUser != null)
				return false;
		} else if (!typeOfUser.equals(other.typeOfUser))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", login=" + login + ", password=" + password
				+ ", typeOfUser=" + typeOfUser + "]";
	}


	public String toFile(String separator) {
		// TODO Auto-generated method stub
		return getName() + separator + getSurname() + separator + getLogin() 
		+ separator + getPassword() + separator + getTypeOfUser();
	}



	
}
