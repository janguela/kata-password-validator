/**
 * @author Jordi Anguela (janguela)
 */
public class PasswordValidator {

	public PasswordValidator() {
		super();
	}

	public boolean validate(String passw) {
		return hasMoreThanEightCharacters(passw) && containsCapitalLetter(passw);
	}

	private boolean hasMoreThanEightCharacters(String passw) {
		return passw != null && passw.length() > 8;
	}

	private boolean containsCapitalLetter(String passw) {
		return passw.matches("^.*[A-Z].*$");
	}

}