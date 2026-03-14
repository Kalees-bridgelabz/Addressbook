package com.addressbook;

import java.util.Scanner;

/**
 * UC1 - Ability to add a new
 *
 * Requirements:
     *   - Contact to Address Book
     *   - Use Console to add person details from
     *   - AddressBookMain class
     *   - Use Object Oriented Concepts to manage
     *   - relationship between AddressBook and Contact
 *
 * @author  Kalees-bridgelabz
 * @version 1.0
 */
public class AddressbookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Addressbook");
        
        System.out.println("\n=== UC1: Ability to add a new ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name : "); String firstName = scanner.nextLine();
        System.out.print("Enter Last Name  : "); String lastName  = scanner.nextLine();
        System.out.print("Enter Phone      : "); String phone     = scanner.nextLine();
        System.out.print("Enter Email      : "); String email     = scanner.nextLine();
        System.out.println("Created: " + firstName + " " + lastName);
        scanner.close();
    }
}
