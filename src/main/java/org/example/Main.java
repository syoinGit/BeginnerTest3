package org.example;

public class Main {

  public static void main(String[] args) {
    PhoneNumberInput phoneNumberInput = new PhoneNumberInput();
    PhoneNumberChecker phoneNumberChecker = new PhoneNumberChecker();

    // 電話番号の入力
    System.out.println("電話番号を入力してください");
    String phoneNumber = phoneNumberInput.getPhoneNumber();

    // 電話番号のチェック
    if (phoneNumberChecker.checkPhoneNumber(phoneNumber)) {
      System.out.println(phoneNumber + ": この電話番号は使用できます");
    } else {
      System.out.println("この電話番号は使用できません");
    }


  }
}