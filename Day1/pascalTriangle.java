import java.util.*;
import java.io.*;
public class pascalTriangle {
    public static List<Integer> generatingrow(int row){
        long ans= 1;
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        for(int col =1;col<row;col++){
            ans= ans*(row-col);
            ans=ans/col;
            answer.add((int)ans);
        }
        return answer;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row= 1 ;row<=numRows;row++){
            ans.add(generatingrow(row));
        }
        return ans;
    }
}
