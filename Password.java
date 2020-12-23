
public class Password {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		this.password = password;
		validate();
	}

	private void validate() throws PasswordException {
		if (this.password == null) {
			throw new PasswordException("Password cannot be null");
		} else if (password.length() < 5) {
			throw new PasswordException("Password length cannot be less than 5 charaters");
		} else if (password.length() > 10) {
			throw new PasswordException("Password length cannot be greater than 10 charaters");
		}
	}

}
