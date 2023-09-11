package org.example;

public class MatrixAdder {

    private int[][] matrix2;

    private int[][] matrix1;

    private int[][] resultMatrix;

    private void setMatrices(int rowSize, int colSize) {
        this.matrix1 = new int[rowSize][colSize];
        this.matrix2 = new int[rowSize][colSize];
        this.resultMatrix = new int[rowSize][colSize];
    }

    private void setResultMatrixElement(int rowIdentifier,
                                        int columnIdentifier, int element){
        resultMatrix[rowIdentifier][columnIdentifier] = element;
    }

    public int getResultMatrixElement(int rowIdentifier,
                                      int columnIdentifier){
        return resultMatrix[rowIdentifier][columnIdentifier];
    }

    public int getMatrix1Element(int rowIdentifier,
                                 int columnIdentifier){
        return matrix1[rowIdentifier][columnIdentifier];
    }

    public int getMatrix2Element(int rowIdentifier,
                                 int columnIdentifier){
        return matrix2[rowIdentifier][columnIdentifier];
    }

}
