import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("admin", "password");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
            System.out.println("Login successful. Welcome, " + admin.getUsername() + "!");
            // Add code for admin functionality here
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }

        scanner.close();
    }
}
