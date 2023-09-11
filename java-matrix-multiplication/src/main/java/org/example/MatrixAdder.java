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

    public void addMatrices(int rowSize1, int columnSize){
        for (int i=0; i<rowSize1;i++){
            for (int j=0; j<columnSize;j++){
                int entry = matrix1[i][j] + matrix2[i][j];
                setResultMatrixElement(i,j,entry);
            }
        }
    }

    public int[][] negMatrix(int[][] matrix, int rowSize, int colSize){
        for (int i=0; i<rowSize;i++){
            for (int j=0; j<colSize;j++){
                matrix[i][j] = -matrix[i][j];
            }
        }
        return matrix;
    }

}
