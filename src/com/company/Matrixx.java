package com.company;

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

    public void rotate90() {
        int[][] rotMat = new int[this.cols][this.rows];

        for (int rw = 0; rw < this.rows; rw++)
            for (int cl = 0; cl < this.cols; cl++) {
                rotMat[this.cols - 1 - cl][rw] = this.element[rw][cl];
            }

        this.element = rotMat;
        swapRwCl();

    }

    public void shiftLeft(int steps) {

        for (int i = 0; i < element.length; i++) {
            int realSteps = steps % element[i].length;
            while (realSteps-- > 0) {
                int temp = element[i][0]; //берем первое значение и сохраняем
                for (int j = element[i].length - 1; j >= 0; j--) { //перебор в обратном порядке
                    int val = element[i][j];
                    element[i][j] = temp;//закидываем в последнюю наше первое значение
                    temp = val;
                }
            }
        }
    }
    public void shiftRight(int steps) {

        for (int i = 0; i < element.length; i++) {
            int realSteps = steps % element[i].length;
            while (realSteps-- > 0) {
                int temp = element[i][element.length-1];
                for (int j = 0; j < element.length; j++) { //тут перебираем с начала
                    int val = element[i][j];
                    element[i][j] = temp;
                    temp = val;
                }
            }
        }
    }
    public void shiftUp(int steps) {

        for (int j = 0; j < element.length; j++) {
            int realSteps = steps % element[j].length;
            while (realSteps-- > 0) {
                int temp = element[0][j];
                for (int i = element[j].length - 1; i >= 0; i--) {
                    int val = element[i][j];
                    element[i][j] = temp;
                    temp = val;
                }
            }
        }
    }
    public void shiftDown(int steps) {

        for (int j = 0; j < element.length; j++) {
            int realSteps = steps % element[j].length;
            while (realSteps-- > 0) {
                int temp = element[element.length-1][j];
                for (int i = 0; i < element.length; i++) {
                    int val = element[i][j];
                    element[i][j] = temp;
                    temp = val;
                }
            }
        }
    }


}