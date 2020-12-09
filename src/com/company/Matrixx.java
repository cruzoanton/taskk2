package com.company;

import java.util.Arrays;

class Matrixx {

    int[][] element;
    int rows;
    int cols;


    Matrixx(int rows, int cols, int randomLimit) {
        this.rows = rows;
        this.cols = cols;
        element = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                element[i][j] = (int) Math.round(Math.abs(randomLimit) * Math.random());
            }
//            Arrays.sort(element);
        }
    }

//    public int getValue(int row, int col) {
//        return this.element[row][col];
//    }
//
//    public void setValue(int row, int col, int value) {
//        this.element[row][col] = value;
//    }

    public int getNoRows() {
        return this.rows;
    }

    public int getNoCols() {
        return this.cols;
    }

    private void swapRwCl() {
        int tmp;
        tmp = this.getNoRows();
        this.rows = this.getNoCols();
        this.cols = tmp;
    }

    public void DisplayMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print((this.element[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }

    private void rotate90() {
        int[][] rotMat = new int[this.cols][this.rows];

        for (int rw = 0; rw < this.rows; rw++)
            for (int cl = 0; cl < this.cols; cl++) {
                rotMat[this.cols - 1 - cl][rw] = this.element[rw][cl];
            }

        this.element = rotMat;
        swapRwCl();

    }

    public void rotateMatrix(int angleRot) {

        if (angleRot == 90) {
            rotate90();
        } else if (angleRot == 180) {
            rotate90();
            rotate90();
        } else if (angleRot == 270) {
            rotate90();
            rotate90();
            rotate90();

        }
    }


}