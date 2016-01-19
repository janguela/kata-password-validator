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
		assertPasswordIsFalse("Ab34567_");
	}

	@Test
	public void cannotBeNull() {
		assertPasswordIsFalse(null);
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainAnUpperCaseLetter() {
		assertPasswordIsFalse("b3456789_");
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainALowerCaseLetter() {
		assertPasswordIsFalse("A3456789_");
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainANumber() {
		assertPasswordIsFalse("Abbbbbccccc_");
	}

	@Test
	public void returnsFalseWhenPasswordDoesntContainAnUnderscore() {
		assertPasswordIsFalse("Ab3456789");
	}

	private void assertPasswordIsFalse(String passw) {
		assertFalse(validator.validate(passw));
	}

}
