import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordValidatorTest {

	@Test
	public void hasMoreThanEightCharacters() {
		PasswordValidator validator = new PasswordValidator();
		assertTrue(validator.validate("123456789"));
	}

}
