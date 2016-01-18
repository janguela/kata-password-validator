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
		assertTrue(validator.validate("A23456789"));
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
	public void returnsFalseWhenPasswordDoesntContainACapitalLetter() {
		PasswordValidator validator = new PasswordValidator();
		assertFalse(validator.validate("123456789"));
	}

}
