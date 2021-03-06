/**
 * @author Jordi Anguela (janguela)
 */
public class PasswordValidator {

	public PasswordValidator() {
		super();
	}

	public boolean validate(String passw) {
		return cannotBeNull(passw) && hasMoreThanEightCharacters(passw) && containsUpperCaseLetter(passw) && containsLowerCaseLetter(passw)
				&& containsNumber(passw) && containsUnderscore(passw);
	}

	private boolean cannotBeNull(String passw) {
		return passw != null;
	}

	private boolean hasMoreThanEightCharacters(String passw) {
		return passw.length() > 8;
	}

	private boolean containsUpperCaseLetter(String passw) {
		return passw.matches("^.*[A-Z].*$");
	}

	private boolean containsLowerCaseLetter(String passw) {
		return passw.matches("^.*[a-z].*$");
	}

	private boolean containsNumber(String passw) {
		return passw.matches("^.*\\d.*$");
	}

	private boolean containsUnderscore(String passw) {
		return passw.matches("^.*[_].*$");
	}

}