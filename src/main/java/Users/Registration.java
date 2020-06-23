package Users;


public class Registration {
	
	private String name;
	private String surname;
	private int phone;
	private String email;
	private String emailConfirm;
	private String password;
	private String passwordConfirm;
	
	public Registration(String name, String surname, int phone, String email, String emailConfirm, String password,
			String passwordConfirm) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
		this.emailConfirm = emailConfirm;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}

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

	protected String getEmailConfirm() {
		return emailConfirm;
	}

	protected void setEmailConfirm(String emailConfirm) {
		this.emailConfirm = emailConfirm;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	protected String getPasswordConfirm() {
		return passwordConfirm;
	}

	protected void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	
	
	

}
