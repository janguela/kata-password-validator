public class PasswordValidator {

	public PasswordValidator() {
		super();
	}

	public boolean validate(String passw) {
		return passw != null && passw.length() > 8;
	}

}