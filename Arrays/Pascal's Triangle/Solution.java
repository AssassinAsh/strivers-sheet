// Given an integer numRows, return the first numRows of Pascal's triangle.

import java.util.*;

class Solution {
    public static List<List<Integer>> generate(int numRows) {

        // result - Resulting list of lists.
        List<List<Integer>> result = new ArrayList<>();

        for(int row = 1; row <= numRows; row++) {
            // currentRow - Individual triangle row.
            List<Integer> currentRow = new ArrayList<>();
            for(int col = 0; col < row; col++) {
                if(col == 0 || col == row - 1) {
                    //Adding 1 - if its first element or last element.
                    currentRow.add(1);
                } else {
                    //Adding previous row element to get the current row element.
                    currentRow.add(result.get(row - 2).get(col - 1) + 
                                    result.get(row - 2).get(col));
                }
            }
            result.add(currentRow);
        }
        
        return result;
    }

    public static void main(String[] args) {
        for(List<Integer> list : generate(7)) {
            System.out.println(list);
        }
    }
}