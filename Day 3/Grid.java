import java.util.*;
public class Grid{
    public int uniquePath(int m, int n){
        int N = m+n-2;
        int r = m-1;
        double res=1;
//ncr
        for(int i =1;i<r;i++){
            res= res*(N-r+1)/i;
        }
        return (int)res;
    }
}