
hi 
public class array{
    public static String linearsearch( String name[], int key){


        if(key>= 0 && key< name.length){
            return name[key];
        } else {
            return null;
        }
        

    }

    public static void main(String[] args) {
        String name[] = {"samosa","jalebi", "allo", "gobhi"};
        int key = 2;

        String  index = linearsearch( name , key);
        if(index == null ){
            System.out.println("NOT FOUND ");
        } else{
            System.out.println("Key is at index : " + index);
        }

    }
    public static int getlargest(int number[] ){
        int largest=Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        for(int i = 0; i<number.length;i++){
            if(largest<number[i]) {
                largest = number[i];

            }
            if(smallest>number[i]){
                smallest = number[i];
            }




        }
        System.out.println("smallest value is :" + smallest);
        return largest;


    }
    public static void main(String[] args) {
        int number[] ={1,2,6,3,5};
        System.out.println("Largest value is " + getlargest(number  ));

    }




    public static int binarysearch(int number[] , int key){
        int start = 0 ;
        int end = number.length - 1;

        while (start<=end){
            int mid = (start +end )/2;

            if(number[mid] == key){
                return mid;

            }

            if(number[mid]<key){
                start = mid +1;
            } else {
                end = mid -1;
            }


        }
        return -1;

    } 

    public static void main(String[] args) {
        int number [] = {2,4,6,8,10,12};
        int key = 8;
        System.out.println("index for the key is : "+ binarysearch(number, key));
    }
    
    

    public static void pairarray(int number[]){
        int tp = 0;
        for(int i = 0; i<number.length;i++){
            int current = number[i];
            for(int j = i+1;j<number.length;j++){
                
                System.out.print("("+ current+"," +number[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs =  " + tp );


    }
    public static void main(String[] args) {
            int number [] = {2,4,6,8,10,12,14,16,18,20};
            pairarray(number);
        }


    public static void   subarray(int number[]){
        int ts =0;
        for(int i = 0;i<number.length; i++){
            // int start = number[i];
            for(int j =i;j<number.length;j++){
                // int end = j;
                for(int k =i; k<=j;k++){
                    System.out.print(number[k]+ " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subaRRAY : "+ts);


       
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7,8,9};
        subarray(number);

    }

}

// repeated from now as the order of. peaky blinder

hi 
public class array{
    public static String linearsearch( String name[], int key){


        if(key>= 0 && key< name.length){
            return name[key];
        } else {
            return null;
        }
        

    }

    public static void main(String[] args) {
        String name[] = {"samosa","jalebi", "allo", "gobhi"};
        int key = 2;

        String  index = linearsearch( name , key);
        if(index == null ){
            System.out.println("NOT FOUND ");
        } else{
            System.out.println("Key is at index : " + index);
        }

    }
    public static int getlargest(int number[] ){
        int largest=Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        for(int i = 0; i<number.length;i++){
            if(largest<number[i]) {
                largest = number[i];

            }
            if(smallest>number[i]){
                smallest = number[i];
            }




        }
        System.out.println("smallest value is :" + smallest);
        return largest;


    }
    public static void main(String[] args) {
        int number[] ={1,2,6,3,5};
        System.out.println("Largest value is " + getlargest(number  ));

    }




    public static int binarysearch(int number[] , int key){
        int start = 0 ;
        int end = number.length - 1;

        while (start<=end){
            int mid = (start +end )/2;

            if(number[mid] == key){
                return mid;

            }

            if(number[mid]<key){
                start = mid +1;
            } else {
                end = mid -1;
            }


        }
        return -1;

    } 

    public static void main(String[] args) {
        int number [] = {2,4,6,8,10,12};
        int key = 8;
        System.out.println("index for the key is : "+ binarysearch(number, key));
    }
    
    

    public static void pairarray(int number[]){
        int tp = 0;
        for(int i = 0; i<number.length;i++){
            int current = number[i];
            for(int j = i+1;j<number.length;j++){
                
                System.out.print("("+ current+"," +number[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs =  " + tp );


    }
    public static void main(String[] args) {
            int number [] = {2,4,6,8,10,12,14,16,18,20};
            pairarray(number);
        }


    public static void   subarray(int number[]){
        int ts =0;
        for(int i = 0;i<number.length; i++){
            // int start = number[i];
            for(int j =i;j<number.length;j++){
                // int end = j;
                for(int k =i; k<=j;k++){
                    System.out.print(number[k]+ " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subaRRAY : "+ts);


       
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7,8,9};
        subarray(number);

    }

}