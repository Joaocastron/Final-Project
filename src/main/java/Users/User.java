package Users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String surname;
	private int phone;
	private String email;
	private String passaword;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getSurname() {
		return surname;
	}

	protected void setSurname(String surname) {
		this.surname = surname;
	}

	protected int getPhone() {
		return phone;
	}

	protected void setPhone(int phone) {
		this.phone = phone;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getPassaword() {
		return passaword;
	}

	protected void setPassaword(String passaword) {
		this.passaword = passaword;
	}

	public User(String name, String surname, int phone, String email, String passaword) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
		this.passaword = passaword;
	}
	  @Override
	    public String toString() {
	        return "User{" +
	                "id=" + id +
	                ", Name='" + name + '\'' +
	                ", Surname='" + surname + '\'' +
	                ",phone='"+ phone +
	                ", email='" + email + '\'' +
	                ", password='" + "*********" + '\'' +
	                
	                '}';
	    }

}
