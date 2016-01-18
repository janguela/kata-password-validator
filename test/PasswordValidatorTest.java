import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Jordi Anguela (janguela)
 */
public class PasswordValidatorTest {

	@Test
	public void returnsTrueWhenPasswordIsValid() {
		PasswordValidator validator = new PasswordValidator();
		assertTrue(validator.validate("Ab3456789"));
	}

	@Test
	public void returnsFalseWhenPasswordHasLessThanNineCharacters() {
		PasswordValidator validator = new PasswordValidator();
		assertFalse(validator.validate("12345678"));
	}

	@Test
	public void cannotBeNull() {
		PasswordValidator validator = new PasswordValidator();
		assertFalse(validator.validate(null));
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainAnUpperCaseLetter() {
		PasswordValidator validator = new PasswordValidator();
		assertFalse(validator.validate("1b3456789"));
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainALowerCaseLetter() {
		PasswordValidator validator = new PasswordValidator();
		assertFalse(validator.validate("A23456789"));
	}

}
