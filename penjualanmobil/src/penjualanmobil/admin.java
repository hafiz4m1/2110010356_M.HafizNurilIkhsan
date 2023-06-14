/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanmobil;
 import java.util.Scanner;

/**
 *
 * @author nuril
 */
public class admin {
    

public class AdminLogin {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (login(enteredUsername, enteredPassword)) {
            System.out.println("Login successful. Welcome, Admin!");
            // Additional admin logic or actions can be performed here
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }

    private static boolean login(String enteredUsername, String enteredPassword) {
        return ADMIN_USERNAME.equals(enteredUsername) && ADMIN_PASSWORD.equals(enteredPassword);
    }
}

}


    
