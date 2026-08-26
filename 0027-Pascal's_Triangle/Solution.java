import java.util.*;

class Solution {

    public List<Integer> ncr(int row){
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(1);
        for(int col = 1; col<row; col++){
            ans = ans * (row-col);
            ans = ans / (col);
            list.add(ans);
        }
        return list;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            list.add(ncr(i));
        }
        return list;
    }
}