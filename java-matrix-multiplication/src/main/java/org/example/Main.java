package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the row size of the first matrix");
        int rowSize = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Please enter the column size of the first matrix");
        int colSize1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Please enter the column size of the second matrix");
        int colSize2 = myScanner.nextInt();
        myScanner.nextLine();

        MatrixMultiplier calc = new MatrixMultiplier();
        calc.setMatrixSize(rowSize,colSize1,colSize2);

        System.out.println("For matrix 1");
        for (int i =0; i < rowSize; i++){
            for (int j = 0; j < colSize1; j++){
                System.out.println("Please enter the " + (i+1) + ", " + (j+1) + "th entry of the matrix");
                int entry = myScanner.nextInt();
                calc.setMatrix1Element(i,j,entry);
                myScanner.nextLine();
            }
        }

        System.out.println("For matrix 2");
        for (int i =0; i < colSize1; i++){
            for (int j = 0; j < colSize2; j++){
                System.out.println("Please enter the " + (i+1) + "," + (j+1) + "-th entry of the matrix");
                int entry = myScanner.nextInt();
                calc.setMatrix2Element(i,j,entry);
                myScanner.nextLine();
            }
        }

        for (int i = 0; i<rowSize;i++){
            for (int j = 0; j<colSize1; j++){
                System.out.print(calc.getMatrix1Element(i,j) + " ");
            }
            System.out.println();
        }

        System.out.println("*");

        for (int i = 0; i<colSize1;i++){
            for (int j = 0; j<colSize2; j++){
                System.out.print(calc.getMatrix2Element(i,j) + " ");
            }
            System.out.println();
        }

        calc.multiplyMatrices(rowSize,colSize1,colSize2);
        System.out.println("=");
        for (int i=0;i<rowSize;i++){
            for (int j=0;j<colSize2;j++){
                System.out.print(calc.getResultMatrixElement(i,j) + " ");
            }
            System.out.println();
        }
    }
}