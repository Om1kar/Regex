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
        String regex = "[A-Z][a-z]{3,}$";
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
        String regex = "[A-Z][a-z]{3,}$";
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
    static void validEmail(){
        /*
        UC3-> Valid Email E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co)
              and 2 optional (xyz & in) with precise @ and . positions.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter E-mail");
        String email = scanner.nextLine();
        /*
        pattern of e-mail string => abc.xyz@bl.co.in
         */
        String regex = "[a-z]{2,}.[a-z]{2,}[@][a-z]{1,}.[a-z]{1,}.[a-z]{1,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(email + "\nE-mail is Valid");
        } else {
            System.out.println(email + " Invalid E-mail ");
            validFirstName();
            validLastName();
            validEmail();
        }
    }
    static void validContactNo(){
        /*
        UC4-> valid Mobile Format - E.g. 91 9919819801 - Country
              code follow by space and 10-digit number
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Contact No-");
        String contactNo = scanner.nextLine();
        String regex = "[0-9]{2} [0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contactNo);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(contactNo + "\nContact No.is Valid");
        } else {
            System.out.println(contactNo + "\nInvalid Contact No.");
            validFirstName();
            validLastName();
            validEmail();
            validContactNo();
        }
    }
    static void validPasswordRule(){
        /*
        UC5-> password Rule1– minimum 8 Characters
        UC6-> at least 1 upper case
        UC7-> at least one numeric number
        UC8-> at lest one special character
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password");
        String password1 = scanner.nextLine();
        String regex = "[A-Z]{1}[0-9]{1}[@#%&*!$^]{1}[a-z]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password1);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(password1+"\nPassword is Valid");
            System.out.println("All Rules are Passed");
        } else {
            System.out.println(password1 + "\nInvalid Password");
            validFirstName();
            validLastName();
            validEmail();
            validContactNo();
            validPasswordRule();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program");
        validFirstName();
        validLastName();
        validEmail();
        validContactNo();
        validPasswordRule();
    }
}
