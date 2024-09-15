package org.example;

public class PhoneNumberChecker {

  public boolean checkPhoneNumber(String phoneNumber) {

    return phoneNumber.matches("^(080|090)(\\d{8}|-\\d{4}-\\d{4})$");

  }

}
