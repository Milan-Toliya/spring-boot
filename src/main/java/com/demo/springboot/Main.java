package com.demo.springboot;

public class Main {
    private static int size = 5, index = 0, row = 0, col = 0;

    private static char[] direction = new char[] {'r', 'd', 'l', 'u'};

    private static int matrix[][] = new int[size][size];

    private static boolean insertDown(int i) {
        if (row + 1 <= size && matrix[row][col] != 0) {
            index++;
            row--;
        } else {
            if (row + 1 <= size) {
                matrix[row++][col] = i;
                return true;
            } else {
                index++;
                row--;
                col--;
            }
        }
        return false;
    }

    // private static boolean insert(int i, int row, int col) {
    // if (col + 1 <= size && matrix[row][col] != 0) {
    // index++;
    // col--;
    // } else {
    // if (col + 1 <= size) {
    // matrix[row][col++] = i;
    // return true;
    // } else {
    // index++;
    // col--;
    // row++;
    // }
    // }
    // return false;
    // }

    private static boolean insertLeft(int i) {
        if (col >= 0 && matrix[row][col] != 0) {
            index++;
            col++;
        } else {
            if (col >= 0) {
                matrix[row][col--] = i;
                return true;
            } else {
                index++;
                row--;
                col++;
            }
        }
        return false;
    }

    private static boolean insertRight(int i) {
        if (col + 1 <= size && matrix[row][col] != 0) {
            index++;
            col--;
        } else {
            if (col + 1 <= size) {
                matrix[row][col++] = i;
                return true;
            } else {
                index++;
                row++;
                col--;
            }
        }
        return false;
    }


    private static boolean insertUp(int i) {
        if (row + 1 <= size && matrix[row][col] != 0) {
            index++;
            row--;
        } else {
            if (row + 1 <= size) {
                matrix[row++][col] = i;
                return true;
            } else {
                index++;
                row++;
                col++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int nums = size * size + 1;

        for (int i = 1; i < nums;) {
            switch (direction[index % 4]) {
                case 'r':
                    // insert(i, row, col - 1);
                    if (insertRight(i))
                        i++;
                    break;
                case 'd':
                    if (insertDown(i))
                        i++;
                    break;
                case 'l':
                    if (insertLeft(i))
                        i++;
                    break;
                case 'u':
                    if (insertUp(i))
                        i++;
                    break;
                default:
            }
        }

        print();
    }

    private static void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
