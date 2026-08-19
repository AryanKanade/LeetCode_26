import java.util.ArrayList;

class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> zeroRows = new ArrayList<>();
        ArrayList<Integer> zeroCols = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(zeroCols.contains(j) || zeroRows.contains(i)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}