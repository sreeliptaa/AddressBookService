package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {
    @Test
    void givenUserName_WhenChecked_ShouldReturnTrue() {
        AddressBookMain addressBookMain = new AddressBookMain();
        boolean result = addressBookMain.validateName("Sreelipta");
        Assertions.assertTrue(result);
    }

    @Test
    void givenUserCity_WhenChecked_ShouldReturnTrue() {
        AddressBookMain addressBookMain = new AddressBookMain();
        boolean result = addressBookMain.validateName("Cuttack");
        Assertions.assertTrue(result);
    }

    @Test
    void givenUserState_WhenChecked_ShouldReturnTrue() {
        AddressBookMain addressBookMain = new AddressBookMain();
        boolean result = addressBookMain.validateName("Odisha");
        Assertions.assertTrue(result);
    }

    @Test
    void givenUserZip_WhenChecked_ShouldReturnTrue() {
        AddressBookMain addressBookMain = new AddressBookMain();
        boolean result = addressBookMain.validateName("753014");
        Assertions.assertTrue(result);
    }

    @Test
    void givenUserEmail_WhenChecked_ShouldReturnTrue() {
        AddressBookMain addressBookMain = new AddressBookMain();
        boolean result = addressBookMain.validateName("Sree5@gmail.com");
        Assertions.assertTrue(result);
    }


}


