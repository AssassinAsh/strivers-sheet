// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

import java.util.*;

class Solution {
    public static void setZeroes(int[][] matrix) {

        boolean zeroRow = false, zeroCol = false;
        
        //Check if first Column is to be set zero.
        for(int row = 0; row < matrix.length; row++) {
            if(matrix[row][0] == 0) {
                zeroCol = true;
                break;
            }
        }
        
        //Check if first Row is to be set zero.
        for(int i : matrix[0]) {
            if(i == 0) {
                zeroRow = true;
                break;
            }
        }

        //Setting first row and column elements to zero in case an element is zero.
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //Setting required columns to zero.
        for(int col = 1; col < matrix[0].length; col++) {
            if(matrix[0][col] == 0) {
                setZeroCol(col, matrix);
            }
        }

        //Setting required rows to zero.
        for(int row = 1; row < matrix.length; row++) {
            if(matrix[row][0] == 0) {
                setZeroRow(row, matrix);
            }
        }

        //Setting first row to zero if required.
        if(zeroRow) {
            setZeroRow(0, matrix);
        }

        //Setting first column to zero if required.
        if(zeroCol) {
            setZeroCol(0, matrix);
        }
    }

    //Function to set a particular column to zero.
    private static void setZeroCol(int col, int[][] matrix) {
        for(int row = 0; row < matrix.length; row++) {
            matrix[row][col] = 0;
        }
    }

    //Function to set a particular row to zero.
    private static void setZeroRow(int row, int[][] matrix) {
        for(int col = 0; col < matrix[row].length; col++) {
            matrix[row][col] = 0;
        }
    }


    public static void main(String[] args) {
        int matrix[][] = new int[][] {{1,1,1},{1,0,1},{1,1,1}};  
        setZeroes(matrix);
        for(int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}