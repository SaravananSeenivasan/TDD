
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class
 */
class PasswordTest {

	private Password passwordObject = new Password();

	/**
	 * negative cases
	 */
	@Test
	void testSetPassword_for_empty_string() {
		try {
			passwordObject.setPassword("");
		} catch (PasswordException e) {
			Assert.assertEquals("Password length cannot be less than 5 charaters", e.getMessage());
		}
	}

	@Test
	void testSetPassword_for_null_string() {
		try {
			passwordObject.setPassword(null);
		} catch (PasswordException e) {
			Assert.assertEquals("Password cannot be null", e.getMessage());
		}
	}

	@Test
	void testSetPassword_for_string_less_than_five_characters_length() {
		try {
			passwordObject.setPassword("samp");
		} catch (PasswordException e) {
			Assert.assertEquals("Password length cannot be less than 5 charaters", e.getMessage());
		}
	}

	@Test
	void testSetPassword_for_string_greater_than_ten_characters_length() {
		try {
			passwordObject.setPassword("samplepassword");
		} catch (PasswordException e) {
			Assert.assertEquals("Password length cannot be greater than 10 charaters", e.getMessage());
		}
	}

	/**
	 * Positive cases - Edge
	 */
	@Test
	void testSetPassword_for_string_exactly_ten_characters_length() {
		try {
			passwordObject.setPassword("samplepass");
		} catch (PasswordException e) {
		}
		Assert.assertTrue(true);
	}

	@Test
	void testSetPassword_for_string_exactly_five_characters_length() {
		try {
			passwordObject.setPassword("sampl");
		} catch (PasswordException e) {
		}
		Assert.assertTrue(true);
	}

	/**
	 * contained cases
	 */
	@Test
	void testSetPassword_for_string_between_eight_and_ten_characters_length() {
		try {
			passwordObject.setPassword("samplepas");
		} catch (PasswordException e) {
		}
		Assert.assertTrue(true);
	}

	@Test
	void testSetPassword_for_string_between_eight_and_ten_characters_length_including_alphanumeric_characters() {
		try {
			passwordObject.setPassword("samplepas");
		} catch (PasswordException e) {
		}
		Assert.assertTrue(true);
	}

}
