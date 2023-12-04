package my_package;

import java.util.Scanner;

public class Util {

    public static String getSigninOption() {            
        int choice = getChoice(signinOptions.length);
        return signinOptions[choice];
    }

    public static void printSigninMsg() {
        printOptions(signinOptions);
    }

    public static String getInput(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    private static int getChoice(int numOptions) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (!Util.isValidInput(input, numOptions)) {
            System.out.println("Invalid input. Please try again.");
            input = scanner.nextInt();
        }
        scanner.close();
        return input - 1;
    }

    private static boolean isValidInput(int input, int numOptions) {
        for (int i = 0; i < numOptions; i++) {
            if (input == i + 1) {
                return true;
            }
        }
        return false;
    }

    private static void printOptions(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println("[" + (i + 1) + "] " + options[i]);
        }
    }

    private static String[] signinOptions  = {
        "Register",
        "Login"
    };

}