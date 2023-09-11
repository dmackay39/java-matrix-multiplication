package org.example;

import java.util.Scanner;

public class AdderUI {
    public void runUI() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the row size of the matrices");
        int rowSize = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Please enter the column size of the matrices");
        int colSize = myScanner.nextInt();
        myScanner.nextLine();

        MatrixAdder calc = new MatrixAdder();
        calc.setMatrices(rowSize,colSize);

        System.out.println("For matrix 1");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.println("Please enter the " + (i + 1) + ", " + (j + 1) + "th entry of the matrix");
                int entry = myScanner.nextInt();
                calc.setMatrix1Element(i, j, entry);
                myScanner.nextLine();
            }
        }

        System.out.println("For matrix 2");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.println("Please enter the " + (i + 1) + "," + (j + 1) + "-th entry of the matrix");
                int entry = myScanner.nextInt();
                calc.setMatrix2Element(i, j, entry);
                myScanner.nextLine();
            }
        }

        boolean correct = false;
        while (!correct) {
            System.out.println("Would you like to add (+) or subtract (-)");
            String opChar = myScanner.nextLine();
            if (opChar.equals("+")){
                calc.addMatrices(rowSize,colSize);
                correct = true;
            }
            else if (opChar.equals("-")){
                calc.subMatrices(rowSize,colSize);
                correct = true;
            }
            else{
                System.out.println("Invalid character, enter again");
            }
        }

        for (int i = 0; i<rowSize;i++){
            for (int j = 0; j<colSize; j++){
                System.out.print(calc.getMatrix1Element(i,j) + " ");
            }
            System.out.println();
        }

        System.out.println("*");

        for (int i = 0; i<rowSize;i++){
            for (int j = 0; j<colSize; j++){
                System.out.print(calc.getMatrix2Element(i,j) + " ");
            }
            System.out.println();
        }

        System.out.println("=");
        for (int i=0;i<rowSize;i++){
            for (int j=0;j<colSize;j++){
                System.out.print(calc.getResultMatrixElement(i,j) + " ");
            }
            System.out.println();
        }


    }
}
