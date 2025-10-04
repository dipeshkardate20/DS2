import java.util.*;



public class bitmanupilation {

    // public static void main(String[]args){
    //     System.out.println((2&1 ));
    //     System.out.println((5|6 ));
    //     System.out.println((5^6 ));
    //     System.out.println((~0  ));
    //     System.out.println((5<<2));
    //     System.out.println((5>>2));
    // }

    public static void oddeven(int n ){

        int  bitmask = 1;

        if((n & bitmask) == 1 ){
            System.out.println(" the n is odd");

        }
        else{
            System.out.println("The n is even ");
        }

    }
    // public static void main(String []args){
    //     int n = 3;
    //     oddeven(n);
    // } 

    public static void ithbit(int n,int places ){

        int  bitmask = 1<<0;
        // 
        // 
        // 

        //   hello is there wrking well 
        // 
        // hello there was an anniversary of tmine coding for the whole year 

        if((n & bitmask) == 0 ){
            System.out.println(" the ithbit is 0");

        }
        else{
            System.out.println("The ithbit is 1 ");
        }

    }
    // public static void main(String []args){
    //     int n = 3;
    //     ithbit(10, 2);
    // } 

    public static void oore(int n ){
        int bitask = 1;

        if((n & bitask) == 1){
            System.out.println("Odd number");
        } else {
            System.out.println("even number");
        }

    }
    public static void main(String []args ){
        oore(23);
        oore(3);
        oore(24);
        

    }

 }