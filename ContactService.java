// Author Name: Nick Cleveland

// Date: March 14, 2022

// Course ID: CS-320-T4517

package contactService;

import java.util.ArrayList;

public class ContactService {
	
	// Create new array
	ArrayList<Contact>contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	// Display contact list
	public void displayContact() {
		for(Contact c : contacts) {
			System.out.print(c.toString());
		}
	}
	
	// Add contact
	public boolean addContact(Contact newContact) {
		// Create boolean operator
		boolean isPresent = false;
		
		// Check is contact is already present
		for(Contact c : contacts) {
			if(c.getContactId().equalsIgnoreCase(newContact.getContactId())) {
				
				isPresent = true;
				throw new IllegalArgumentException("Contact Already Present");
			}
		}
		
		// If contact is not present add contact to list
		if(!isPresent) {
			contacts.add(newContact);
			return true;
		}
		else {
			return false;
		}
	}

	// Delete contact
	public boolean deleteContact(String contactId) {
		// Create boolean operator
		boolean isDeleted = false;
		
		// Check if contact is in list, if so remove it
		for(Contact c : contacts) {
			if(c.getContactId().equalsIgnoreCase(contactId)) {
				contacts.remove(c);
				isDeleted = true;
				throw new IllegalArgumentException("Contact Not Found");
			}
		}
		return isDeleted;
	}
	
	// Update contact first name
	public boolean updateContactFirstName(String contactId, String newFirstName) {
		// Create boolean operator
		boolean isUpdated = false;
		
		// Check if contact is in list, if so update last name
		for(Contact c : contacts) {
			if(c.getContactId().equalsIgnoreCase(contactId)) {
				c.setFirstName(newFirstName);
				isUpdated = true;
				throw new IllegalArgumentException("Contact Not Found");
			}
		}
		return isUpdated;
	}
	
	// Update contact last name
	public boolean updateContactLastName(String contactId, String newLastName) {
		// Create boolean operator
		boolean isUpdated = false;
		
		// Check if contact is in list, if so update last name
		for(Contact c : contacts) {
			if(c.getContactId().equalsIgnoreCase(contactId)) {
				c.setLastName(newLastName);
				isUpdated = true;
				throw new IllegalArgumentException("Contact Not Found");
			}
		}
		return isUpdated;
	}
	
	// Update contact phone number
	public boolean updateContactPhoneNumber(String contactId, String newPhoneNumber) {
		// Create boolean operator
		boolean isUpdated = false;
		
		// Check if contact is in list, if so update last name
		for(Contact c : contacts) {
			if(c.getContactId().equalsIgnoreCase(contactId)) {
				c.setPhoneNumber(newPhoneNumber);
				isUpdated = true;
				throw new IllegalArgumentException("Contact Not Found");
			}
		}
		return isUpdated;
	}
	// Update contact address
	public boolean updateContactAddress(String contactId, String newAddress) {
		// Create boolean operator
		boolean isUpdated = false;
		
		// Check if contact is in list, if so update last name
		for(Contact c : contacts) {
			if(c.getContactId().equalsIgnoreCase(contactId)) {
				c.setContactAddress(newAddress);
				isUpdated = true;
				throw new IllegalArgumentException("Contact Not Found");
			}
		}
		return isUpdated;
	}
	
}
