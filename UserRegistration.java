package Rejex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static void validFirstName() {
        /*
        UC1-> First name starts with Cap and has minimum 3 characters
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();
        /*
        first letter is Capital and other small letters =>minimum 3
         */
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(firstName + "\nName is Valid");
        } else {
            System.out.println(firstName + " Invalid Name");
            validFirstName();
        }
    }
    static void validLastName(){
        /*
        UC2->Last name starts with Cap and has minimum 3 character
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name");
        String lastName = scanner.nextLine();
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(lastName + "\nLast Name is Valid");
        } else {
            System.out.println(lastName + " Invalid Name");
            validFirstName();
            validLastName();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program");
        validFirstName();
        validLastName();
    }
}
