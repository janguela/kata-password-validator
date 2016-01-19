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
		assertTrue(validator.validate("Ab3456789_"));
	}

	@Test
	public void returnsFalseWhenPasswordHasLessThanNineCharacters() {
		assertFalse(validator.validate("Ab34567_"));
	}

	@Test
	public void cannotBeNull() {
		assertFalse(validator.validate(null));
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainAnUpperCaseLetter() {
		assertFalse(validator.validate("b3456789_"));
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainALowerCaseLetter() {
		assertFalse(validator.validate("A3456789_"));
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainANumber() {
		assertFalse(validator.validate("Abbbbbccccc_"));
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainAnUnderscore() {
		assertFalse(validator.validate("Ab3456789"));
	}

}
