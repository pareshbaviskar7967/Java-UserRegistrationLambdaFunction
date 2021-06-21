package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.InvalidDetailException;
import main.UserRegistration;

class UserRegistrationTest {
	@Test
	public void testfirstName_shouldReturnTrue() throws InvalidDetailException {
		String firstName = "Paresh";
		boolean isValidFirstName = UserRegistration.isValidFirstName(firstName);
		assertTrue(isValidFirstName);
	}

	@Test
	public void testfirstName_shouldReturnFalse() throws InvalidDetailException {
		String firstName = "paREsh";
		boolean isValidFirstName = UserRegistration.isValidFirstName(firstName);
		assertFalse(isValidFirstName);
	}

	@Test
	public void testlastName_shouldReturnTrue() throws InvalidDetailException {
		String lastName = "Baviskar";
		boolean isValidLastName = UserRegistration.isValidLastName(lastName);
		assertTrue(isValidLastName);
	}

	@Test
	public void testlastName_shouldReturnFalse() throws InvalidDetailException {
		String lastName = "baVISKar";
		boolean isValidLastName = UserRegistration.isValidLastName(lastName);
		assertFalse(isValidLastName);
	}

	@Test
	public void testmobileNumber_shouldReturnTrue() throws InvalidDetailException {
		String mobileno = "91 8408095441";
		boolean isValidMobileNo = UserRegistration.isValidMobileNo(mobileno);
		assertTrue(isValidMobileNo);
	}

	@Test
	public void testmobileNumber_shouldReturnFalse() throws InvalidDetailException {
		String mobileno = "8408095441";
		boolean isValidMobileNo = UserRegistration.isValidMobileNo(mobileno);
		assertFalse(isValidMobileNo);
	}

	@Test
	public void testpinCode_shouldReturnTrue() throws InvalidDetailException {
		String pincode = "425 001";
		boolean isValidPincode = UserRegistration.isValidPincode(pincode);
		assertTrue(isValidPincode);
	}

	@Test
	public void testpinCode_shouldReturnFalse() throws InvalidDetailException {
		String pincode = "4P5 00B";
		boolean isValidPincode = UserRegistration.isValidPincode(pincode);
		assertFalse(isValidPincode);
	}

	@Test
	public void testemail_shouldReturnTrue() throws InvalidDetailException {
		String email = "iamparesh@gmail.com";
		boolean isValidEmailId = UserRegistration.isValidEmailId(email);
		assertTrue(isValidEmailId);
	}

	@Test
	public void testemail_shouldReturnFalse() throws InvalidDetailException {
		String email = "#$%^&paresh@gmail.com";
		boolean isValidEmailId = UserRegistration.isValidEmailId(email);
		assertFalse(isValidEmailId);
	}

	@Test
	public void testpassword_shouldReturnTrue() throws InvalidDetailException {
		String password = "Psboo7@123";
		boolean isValidPassword = UserRegistration.isValidPassword(password);
		assertTrue(isValidPassword);
	}

	@Test
	public void testpassword_shouldReturnFlase() throws InvalidDetailException {
		String password = "abcd@123";
		boolean isValidPassword = UserRegistration.isValidPassword(password);
		assertFalse(isValidPassword);
	}
}
