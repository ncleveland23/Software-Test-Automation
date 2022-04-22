// Author Name: Nick Cleveland

// Date: March 14, 2022

// Course ID: CS-320-T4517

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.Contact;

// Create Contact Test Class
class ContactTest {
	
	//  Test contact
	@Test
	void testContact() {
		Contact contact = new Contact("0987654321", "Nick", "Cleveland", "1234567890","111 E Road");
		assertTrue(contact.getContactId().equals("0987654321"));
		assertTrue(contact.getFirstName().equals("Nick"));
		assertTrue(contact.getLastName().equals("Cleveland"));
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
		assertTrue(contact.getContactAddress().equals("111 E Road"));
	}
	
	// Test contact ID is null
		@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Nick", "Cleveland", "1234567890", "111 E Road");
		});
	}
		
	// Test contact ID is too long
	void testContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("109876543210", "Nick", "Cleveland", "1234567890", "111 E Road");
		});
	}
		
	// Test if contact first name is null
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0987654321", null, "Cleveland", "1234567890", "111 E Road");	
		});
	}
	
	// Test contact first name too long 
	@Test
	void testContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0987654321", "NicholasCleveland", "Cleveland", "1234567890", "111 E Road");
		});
	}
	
	// Test if contact last name is null
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0987654321", "Nick", null, "1234567890", "111 E Road");
		});
	}
		
	// Test contact last name too long
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0987654321", "Nick", "ClevelandNick", "1234567890", "111 E Road");
		});
	}
	
	// Test if contact phone number is null
		@Test
	void testContactPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0987654321", "Nick", "Cleveland", null, "111 E Road");
		});
	}
		
	// Test contact phone number too short
	@Test
	void testContactPhoneNumberToShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0987654321", "Nick", "Cleveland", "123456789", "111 E Road");
		});
	}
	
	// Test contact phone number too long
	@Test
	void testContactPhoneNumberToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0987654321", "Nick", "Cleveland", "12345678910", "111 E Road");
		});
	}
	
	// Test if contact first name is null
		@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0987654321", "Nick", "Cleveland", "1234567890", null);
		});
	}
		
	// Test contact address too long
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0987654321", "Nick", "Cleveland", "1234567890", "111 E Boulevard, New Hapshire 123456");
		});
	}
}
