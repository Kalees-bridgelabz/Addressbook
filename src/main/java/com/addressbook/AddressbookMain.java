package com.addressbook;

import java.util.Scanner;

/**
 * UC2 - Ability to edit
 *
 * Requirements:
     *   - existing contact
     *   - person using their
     *   - name
     *   - Use Console to edit person details
 *
 * @author  Kalees-bridgelabz
 * @version 1.0
 */
public class AddressbookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Addressbook");
        
        System.out.println("\n=== UC2: Ability to edit ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to edit: ");
        String name = scanner.nextLine();
        // TODO: Implement edit logic
        System.out.println("Edit operation for: " + name);
        scanner.close();
    }
}
