import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Jordi Anguela (janguela)
 */
public class PasswordValidatorTest {

	private PasswordValidator validator;

	@Before
	public void setup() {
		validator = new PasswordValidator();
	}

	@Test
	public void returnsTrueWhenPasswordIsValid() {
		assertTrue(validator.validate("Ab3456789"));
	}

	@Test
	public void returnsFalseWhenPasswordHasLessThanNineCharacters() {
		assertFalse(validator.validate("12345678"));
	}

	@Test
	public void cannotBeNull() {
		assertFalse(validator.validate(null));
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainAnUpperCaseLetter() {
		assertFalse(validator.validate("1b3456789"));
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainALowerCaseLetter() {
		assertFalse(validator.validate("A23456789"));
	}

}
