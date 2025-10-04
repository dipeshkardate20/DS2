
public class twodarrays {
    
    public static int maximum(int matrix[][]){
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[0].length;j++){
                if (matrix[i][j]> max ){
                    max = matrix[i][j];
                    

                }
            }
        }System.out.println(max);
        return max ;
        

    }
    public static boolean  searchkey(int matrix[][],int key ){
        for (int i = 0; i <matrix.length  ; i++){
            for (int j = 0; j < matrix[0].length; j++ ){
                if(matrix[i][j] == key){
                    System.err.println("Found at index ("+ i + "," + j+ ")" );
                    return true;
                }
            }
            

        } 
        System.out.println("Key not found !!");
            return false; 
    }
   
    // public static void main(String args[] ){
    //     int matrix[][] = new int[3][3];
    //     int n = matrix.length;
    //     int m = matrix[0].length;

    //     Scanner sc = new Scanner(System.in);

    //     for (int i = 0; i < n; i++){
    //         for (int j = 0; j < m; j++ ){
    //             matrix[i][j] = sc.nextInt();
    //         }
    //     }

    //     for (int i = 0; i < n; i++){
    //         for (int j = 0; j < m; j++ ){
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     } 
        
    //     searchkey(matrix, 4);
    //     maximum(matrix);

    // }

    public static void  printspiral(int matrix[][]){

        int startrow = 0 ;
        int startcol = 0 ;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow<=endrow && startcol<= endcol){

            // top boundry
            for(int j = startcol ; j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            // right boundry
            for(int i=startrow+1; i<=endrow;i++) {
                
                System.out.print(matrix[i][endcol]+" ");
            }
            // bottom. boundry 
            for( int j = endcol-1;j>=startcol;j--) {
                if(startrow == endrow){
                    break;
                }
            
                System.out.print(matrix[endrow][j]+ " ") ;
            }
            // leftboundry
            for(int i = endrow-1;i>=startrow+1;i--) {
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+ " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        
        


    }

    // public static void main (String[] args ){
    //     int matrix [][] = {{1,2,3,4},
    //                       {5,6,7,8},
    //                       {9,10,11,12},
    //                       {13,14,15,16}};

    //     printspiral(matrix);                  
    // }

    public static int diagonal(int matrix[][]){
        int sum = 0 ;
        for(int i = 0 ; i<matrix.length;i++) {

            sum += matrix[i][i];
            
            if(i!= matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];

            }
             


        }   
        return sum;     
    
    }

    // 
    
    public static boolean sortedsearch(int matrix[][], int key){

        int row = 0 , col = matrix[0].length-1;

        while(row<matrix.length && col>= 0){

            if(matrix[row][col] == key){
                System.out.println("Found the key ("+row+"," + col+ ")");
                return true;
            }

            else if (key<matrix[row][col]){
                col--;
            }

            else {
                row++;
            }

        }
        System.out.println("Key not found ");
        return false ;
 

    }

    public static void main(String[]args){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                           {27,29,37,48},
                        {32,33,39,50}};
        
        int key = 33;
        sortedsearch(matrix,key); 

    }
}
