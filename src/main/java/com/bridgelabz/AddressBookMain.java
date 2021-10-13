package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Service");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContact();
    }

    /**
     * This method is used to add a person's details
     */

    public void addContact() {
        Contact contacts = new Contact();
        contacts.setFirstName("Sreelipta");
        contacts.setLastName("Sahoo");
        contacts.setAddress("Cda");
        contacts.setCity("Cuttack");
        contacts.setState("Odishs");
        contacts.setZip(753014);
        contacts.setPhoneNumber(806467666);
        contacts.setEmail("sree5@gmail.com");
    }

    public boolean validateName(String name) {
        Contact details = new Contact();
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(details.getFirstName());
        boolean b = matcher.matches();
        if (details.getFirstName().isEmpty())
            return false;
        return b;
    }

    public boolean validateAddress(String address) {
        Contact details = new Contact();
        Pattern pattern = Pattern.compile("^([a-zA-z0-9-_+.]+)" +
                "@([a-z0-9-]+)\\.([a-z,]{2,4})((\\.[a-z]{2,4})?)$");
        Matcher matcher = pattern.matcher(details.getAddress());
        boolean b = matcher.matches();
        if (details.getAddress().isEmpty())
            return false;
        return b;
    }


    public boolean validateEmail(String email) {
        Contact details = new Contact();
        Pattern pattern = Pattern.compile("^[a-z]+(\\\\.[a-zA-Z0-9]+)*@[a-z]{2,}\\\\.[a-z]{2,3}(\\\\.[a-z]{2,3})*$");
        Matcher matcher = pattern.matcher(details.getEmail());
        boolean b = matcher.matches();
        if (details.getEmail().isEmpty())
            return false;
        return b;
    }


}
