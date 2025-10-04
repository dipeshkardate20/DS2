import java.util.*;

public class hwquestion {

    public static int searchnum(int matrix[][],int key){
        int c = 0 ;
        for(int i = 0 ; i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    c++;
                }
            }
        }
        return c;
        
    }
    // public static void main(String[]args ){
    //     int matrix[][] = { {4,7,8},
    //                        {8,8,7},{4,7,8},
    //                        {8,8,7},{4,7,8},
    //                        {8,8,7},{4,7,8},
    //                        {8,8,7} };

    //     System.out.println(searchnum(matrix, 7));             
    // }

    public static int printrow(int nums[][],int key){
        int sum = 0 ;

        for(int j = 0;j<nums[0].length;j++){
            sum += nums[key][j];
        }
        return sum;
    

    }

    // public static void main(String[]args){
    //     int[][] nums = { {1,4,9},
    //                      {11,4,3},
    //                      {2,2,3} };

    //     System.out.println(printrow(nums, 1));


    // }


    public static void transpose(int matrix[][]){

        for(int i = 0; i<matrix[0].length;i++){
            for(int j = 0; j <matrix.length;j++ ){
                System.out.println(matrix[j][i]);
            }
            System.out.println();
        } 
       
        
        


    }

    public static void main(String[]args){
        int matrix[][] = {{1,2,3},{4,5,6}};

        transpose(matrix);


    }
}