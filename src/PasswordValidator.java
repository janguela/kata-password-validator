/**
 * @author Jordi Anguela (janguela)
 */
public class PasswordValidator {

	public PasswordValidator() {
		super();
	}

	public boolean validate(String passw) {
		return hasMoreThanEightCharacters(passw) && containsUpperCaseLetter(passw) && containsLowerCaseLetter(passw);
	}

	private boolean hasMoreThanEightCharacters(String passw) {
		return passw != null && passw.length() > 8;
	}

	private boolean containsUpperCaseLetter(String passw) {
		return passw.matches("^.*[A-Z].*$");
	}

	private boolean containsLowerCaseLetter(String passw) {
		return passw.matches("^.*[a-z].*$");
	}

}