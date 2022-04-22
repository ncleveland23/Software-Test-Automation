package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.ContactService;
import contactService.Contact;

// Create Contact Service Test Class
class ContactServiceTest {
	
	// Test add contact
	@Test
	public void testAddContact() {
		// Create new contact service object
		ContactService conSer = new ContactService();
		
		// Create new contact
		Contact con1 = new Contact("001", "Nick", "Cleveland", "1234567890","111 E Road");
		assertEquals(true, conSer.addContact(con1));
	}
	
	// Test delete contact
	@Test
	public void testDeleteContact() {
		// Create new contact service object
		ContactService conSer = new ContactService();
		Contact con1 = new Contact("001", "Nick", "Cleveland", "1234567890","111 E Road");
		Contact con2 = new Contact("002", "Rick", "Cleveland", "1234567890","111 E Road");
		Contact con3 = new Contact("003", "Nicole", "Cleveland", "1234567890","111 E Road");
		conSer.addContact(con1);
		conSer.addContact(con2);
		conSer.addContact(con3);
		assertEquals(true, conSer.addContact(con1));
		assertEquals(true, conSer.addContact(con2));
		assertEquals(true, conSer.addContact(con3));
	}
	

}
