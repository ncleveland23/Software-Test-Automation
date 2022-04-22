// Author Name: Nick Cleveland

// Date: March 14, 2022

// Course ID: CS-320-T4517

package contactService;

// Create Contact Class
public class Contact {
	
	// Declare private variables
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	 
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		
		// The contact ID cannot be null and cannot be longer than 10 digits
		if(contactId == null || contactId.length() > 10) {
			// Test for the exception
			throw new IllegalArgumentException("Invalid Input");
		}
		else {
			this.setContactId(contactId);
		}
		// The contact first name cannot be null and cannot be longer than 10 characters
		if(firstName == null || firstName.length() > 10) {
			// Test for this exception
			throw new IllegalArgumentException("Invalid Input");
		}
		else {
			// Set first name to first name
			this.setFirstName(firstName);
		}
		
		// The contact last name cannot be null and cannot be longer than 10 characters
		if(lastName == null || lastName.length() > 10) {
			// Test for this exception
			throw new IllegalArgumentException("Invalid Input");
		}
		else {
			// Set last name to last name
			this.setLastName(lastName);
		}
		
		// The contact number cannot be null and must be 10 digits
		if(phoneNumber == null || phoneNumber.length() != 10) {
			// Test for this exception
			throw new IllegalArgumentException("Invalid Input");
		}
		else {
			// Set phone number to phone number
			this.setPhoneNumber(phoneNumber);
		}
		
		// The contact address cannot be null and cannot be longer than 30 characters
		if(address == null || address.length() > 30) {
			// Test for this exception
			throw new IllegalArgumentException("Invalid Input");
		}
		else {
			// Set address to address
			this.setContactAddress(address);
		}
		
	}
	
	// Get contact ID
	public String getContactId() {
		return contactId;
	}
	
	// Get contact first name
	public String getFirstName() {
		return firstName;
	}
	
	// Get contact last name
	public String getLastName() {
		return lastName;
	}
	
	// Get contact phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// Get contact address
	public String getContactAddress() {
		return address;
	}
	
	// Generate contact ID
	public void setContactId(String contactId) {
		if(contactId == null || contactId.isBlank()) {
			// Set contact ID to NULL
			this.contactId = "NULL";
		}
		else if(contactId.length() > 10) {
			// Set contact ID to first 10 characters
			this.contactId = contactId.substring(0, 10);
		}
		else {
			this.contactId = contactId;
		}
	}
	
	// Set first name
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.isBlank()) {
			// Set first name to NULL
			this.firstName = "NULL";
		}
		else if(firstName.length() > 10) {
			// Set first name to first 10 characters
			this.firstName = firstName.substring(0, 10);
		}
		else {
			// Set first name to first name
			this.firstName = firstName;
		}
	}
	
	// Set last name
	public void setLastName(String lastName) {
		if(lastName == null || lastName.isBlank()) {
			// Set last name to NULL
			this.lastName = "NULL";
		}
		else if(lastName.length() > 10) {
			// Set last name to first 10 characters
			this.lastName = lastName.substring(0, 10);
		}
		else {
			// Set last name to last name
			this.lastName = lastName;
		}
	}
	
	// Set phone number
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() != 10) {
			// Set phone number to default number 
			this.phoneNumber = "5555555555";
		}
		else {
			// Set phone number to phone number
			this.phoneNumber = phoneNumber;
		}
	}
	
	// Set address
	public void setContactAddress(String address) {
		if(address == null || address.isBlank()) {
			// Set address to NULL
			this.address = "NULL";
		}
		else if(address.length() > 30) {
			// Set address to first 30 characters
			this.address = address.substring(0, 30);
		}
		else {
			// Set address to address
			this.address = address;
		}
	}
	
	// Print contact info
	public String toString() {
		return "Contact [contactID = " + contactId + 
				"First Name=" + firstName +
				"Last Name=" + lastName +
				"Phone Number=" + phoneNumber +
				"Address=" + address + "]";
	}


}
