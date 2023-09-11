package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Would you like to add or multiply two matrices?");
        Scanner mainScanner = new Scanner(System.in);
        String answer = mainScanner.nextLine();

        if (answer.equalsIgnoreCase("multiply")){
            MultiplierUI multiUI = new MultiplierUI();
            multiUI.runUI();
        }
        else if (answer.equalsIgnoreCase("add")){
            AdderUI addUI = new AdderUI();
            addUI.runUI();
        }
        else {
        }
    }
}