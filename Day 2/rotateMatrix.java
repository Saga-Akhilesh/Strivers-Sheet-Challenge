/* 
1. Tranpose the matrix
2. reverse each row in the matrix
*/

import java.util.*;
public class rotateMatrix{
    public void rotate(int matrix[][]){
        // to Transpose the matrix
        for(int i = 0;i< matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //to reverse
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-i];
                matrix[i][matrix.length-1-i]= temp;
            }
        }
    }
}