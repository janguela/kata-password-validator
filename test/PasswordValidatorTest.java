import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordValidatorTest {

	@Test
	public void hasMoreThanEightCharacters() {
		PasswordValidator validator = new PasswordValidator();
		assertTrue(validator.validate("123456789"));
	}

	@Test
	public void cannotBeNull() {
		PasswordValidator validator = new PasswordValidator();
		assertFalse(validator.validate(null));
	}

}
