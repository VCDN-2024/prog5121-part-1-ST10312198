/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe_part1;
import javax.swing.JOptionPane;
/**
 *
 * @author Talha
 */
public class POE_PART1 {
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            // Display menu options
            String[] options = {"Register", "Login", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Select an option:", "Login System", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0: // Register
                    registerUser();
                    break;
                case 1: // Login
                    loginUser();
                    break;
                case 2: // Exit
                    exit = true;
                    JOptionPane.showMessageDialog(null, "Exiting the program.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice.");
            }
        }
    }

    private static void registerUser() {
        String regUsername = readInput("Enter username:");
        String regPassword = readInput("Enter password:");

        Registration registration = new Registration(regUsername, regPassword);
        String registrationStatus = registration.registerUser();
        JOptionPane.showMessageDialog(null, "Registration status: " + registrationStatus);
    }

    private static void loginUser() {
        String enteredUsername = readInput("Enter username:");
        String enteredPassword = readInput("Enter password:");

        // Create a Login object with the entered username and password
        Login login = new Login(enteredUsername, enteredPassword);
        boolean loginResult = login.verifyLogin(enteredUsername, enteredPassword);
        String loginStatus = login.returnLoginStatus(loginResult);
        JOptionPane.showMessageDialog(null, loginStatus);
    }

    // Helper method to read input using JOptionPane
    private static String readInput(String message) {
        return JOptionPane.showInputDialog(message);
    }
}