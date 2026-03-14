package com.addressbook;

import java.util.Scanner;

/**
 * UC3 - Ability to delete a
 *
 * Requirements:
     *   - person using
     *   - person's name
     *   - Use Console to delete a person
 *
 * @author  Kalees-bridgelabz
 * @version 1.0
 */
public class AddressbookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Addressbook");
        
        System.out.println("\n=== UC3: Ability to delete a ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine();
        // TODO: Implement delete logic
        System.out.println("Delete operation for: " + name);
        scanner.close();
    }
}
