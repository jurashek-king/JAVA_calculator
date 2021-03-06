//package cz.engeto.Third_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String exitChar = "q";
        boolean exitProgram = false;
        do {
            exitProgram = calculation(scanner, exitChar);
        } while (!exitProgram);
    }

    static Boolean calculation(Scanner sc, String exitChar) {
        String first, second;
        System.out.println("First:");
        first = sc.nextLine();
        System.out.println("Second:");
        second = sc.nextLine();
        if (first.equals(exitChar) || second.equals(exitChar)) {
            return true;
        }
        System.out.println("Enter operation:");
        String operator = sc.nextLine();
        results(first, second, operator);
        return false;
    }

    static void results(String first, String second, String operator) {
        int result = 0;
        switch (operator) {
            case "+":  // use switch
                result = Integer.parseInt(first) + Integer.parseInt(second);
                break;
            case "-":
                result = Integer.parseInt(first) - Integer.parseInt(second);
                break;
            case "*":
                result = Integer.parseInt(first) * Integer.parseInt(second);
                break;
            case "/":
                try {
                    result = Integer.parseInt(first) / Integer.parseInt(second);
                }catch (ArithmeticException e) {
                    System.out.println("Deleni nulou");
                }
                break;
        }
        System.out.println(result);
    }
}