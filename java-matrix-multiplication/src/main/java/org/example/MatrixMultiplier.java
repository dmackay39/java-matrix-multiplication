package org.example;

public class MatrixMultiplier {
    public int[][] getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(int rowSize, int colSize) {
        this.matrix1 = new int[rowSize][colSize];
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(int rowSize, int colSize) {
        this.matrix2 = new int[rowSize][colSize];
    }

    public void setResultMatrix(int rowSize, int colSize) {
        this.resultMatrix = new int[rowSize][colSize];
    }


    private int[][] matrix2;

    private int[][] matrix1;

    private int[][] resultMatrix;

    public void setMatrix1Element(int rowIdentifier,
                                int columnIdentifier, int element){
        matrix1[rowIdentifier][columnIdentifier] = element;
    }

    public void setMatrix2Element(int rowIdentifier,
                                  int columnIdentifier, int element){
        matrix2[rowIdentifier][columnIdentifier] = element;
    }

    public void setResultMatrixElement(int rowIdentifier,
                                  int columnIdentifier, int element){
        resultMatrix[rowIdentifier][columnIdentifier] = element;
    }

    public int getResultMatrixElement(int rowIdentifier,
                                       int columnIdentifier){
        return resultMatrix[rowIdentifier][columnIdentifier];
    }
    public void setMatrixSize(int rowSize1, int colSize1, int colSize2){
        setMatrix1(rowSize1, colSize1);
        setMatrix2(colSize1, colSize2);
        setResultMatrix(rowSize1,colSize2);
    }

    public void multiplyMatrices(int rowSize1, int columnSize1, int columnSize2){
        for (int i=0; i<rowSize1;i++){
            for (int j=0; j<columnSize2;j++){
                int sumEntries = 0;
                for (int k=0; k<columnSize1;k++){
                    sumEntries += matrix1[i][k]*matrix2[k][j];
                }
                setResultMatrixElement(i,j,sumEntries);
            }
        }
    }


}
