package org.example;

import java.util.Scanner;

public class PhoneNumberInput {

  Scanner scanner = new Scanner(System.in);

  public String getPhoneNumber() {

    return scanner.nextLine();

  }
}
