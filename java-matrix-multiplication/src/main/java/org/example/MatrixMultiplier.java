package org.example;

public class MatrixMultiplier {
    public int[][] getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    private int[][] matrix2;

    private int[][] matrix1;

    public void setMatrixElement(int[][] matrix, int rowIdentifier,
                                int columnIdentifier, int element){
        matrix[rowIdentifier][columnIdentifier] = element;
    }
}
