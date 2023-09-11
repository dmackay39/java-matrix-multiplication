package org.example;

public class MatrixAdder {

    private int[][] matrix2;

    private int[][] matrix1;

    private int[][] resultMatrix;

    public void setMatrices(int rowSize, int colSize) {
        this.matrix1 = new int[rowSize][colSize];
        this.matrix2 = new int[rowSize][colSize];
        this.resultMatrix = new int[rowSize][colSize];
    }

    public void setMatrix1Element(int rowIdentifier,
                                  int columnIdentifier, int element){
        matrix1[rowIdentifier][columnIdentifier] = element;
    }

    public void setMatrix2Element(int rowIdentifier,
                                  int columnIdentifier, int element) {
        matrix2[rowIdentifier][columnIdentifier] = element;
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

    public void subMatrices(int rowSize1, int columnSize){
        for (int i=0; i<rowSize1;i++){
            for (int j=0; j<columnSize;j++){
                int entry = matrix1[i][j] - matrix2[i][j];
                setResultMatrixElement(i,j,entry);
            }
        }
    }
}
