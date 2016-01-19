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
	public void a_password_that_fulfills_the_rules_is_valid() {
		assertTrue(validator.validate("Ab3456789_"));
	}

	@Test
	public void a_password_with_less_than_nine_characters_is_not_valid() {
		assertPasswordIsFalse("Ab34567_");
	}

	@Test
	public void a_null_password_is_not_valid() {
		assertPasswordIsFalse(null);
	}

	@Test
	public void a_password_without_an_upper_case_letter_is_not_valid() {
		assertPasswordIsFalse("b3456789_");
	}

	@Test
	public void a_password_without_a_lower_case_letter_is_not_valid() {
		assertPasswordIsFalse("A3456789_");
	}

	@Test
	public void a_password_without_a_number_is_not_valid() {
		assertPasswordIsFalse("Abbbbbccccc_");
	}

	@Test
	public void a_password_without_an_underscore_is_not_valid() {
		assertPasswordIsFalse("Ab3456789");
	}

	private void assertPasswordIsFalse(String passw) {
		assertFalse(validator.validate(passw));
	}

}
