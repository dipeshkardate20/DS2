import java.util.*;

public class string {

    // public static void main (String [] main){
    // //    Scanner sc = new Scanner (System.in);
    // //    String name;
    // //    name = sc.nextLine();
    // //    System.out.println(name); 

    // // String name = "Dipesh Kardate";
    // // System.out.println(name.length());

    // String first = "Dipesh";
    // String second = "Kardate";
    // String name = (first+ " " + second);
    // System.out.println(name.charAt(3));
    // System.err.println(name.length());

    // for(char i = 0 ; i<name.length();i++){
    //     System.out.print(name.charAt(i));
    // }

    // }

    public static boolean palindrome(String str){
        
        for(int i = 0 ; i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                System.out.println("NOT A PAINDROME");
                return false;
            }
            
        }
        System.out.println("This is an palindrome");
        return true;

    }

    // public static void main(String[]args){
    //     String str = "noon";
    //     System.out.println(palindrome(str));

    // }

    public static float shoretestpath(String dir){    
        int x = 0 ;
        int y = 0;

        for(int i = 0 ; i<dir.length()-1;i++){
            char direction  = dir.charAt(i);

            
            if(direction == 'w'){
                x--;
            }
            else if(direction == 'N'){
                y++;

            }
            else if(direction == 'E'){
                x++;
                
            }
            else{
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return  (float)Math.sqrt(X2+Y2);


    }

    // public static void main(String[]args){
    //     String dir = "WNEENESENNN";
    //     System.out.println(shoretestpath(dir));

    // }
  
    // public static void main(String [] args ){

    //     String str = "Hello world ";
    //     System.out.println(str.substring(0,5));

    // }

    // public static void main(String[]args ){
    //     String fruits[] = {"apple ","hello", "why", "you"};

    //     String largest = fruits[0];
    //     for(int i = 0 ; i<fruits.length;i++){
    //         if(largest.compareTo(fruits[i])<0){
    //             largest = fruits[i];

    //         }
    //     }
    //     System.out.println(largest);  
    // }


    // public static void main (String []args ){
    //     StringBuilder sb = new StringBuilder("");


    //     for(char ch = 'a';ch<='z';ch++){
    //         sb.append(ch);

    //     }

    //     System.out.println(sb);
    // }
    public static String touppercase(String str ){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); 
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase( str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        } 
        return sb.toString();
    }
    // public static void main(String []args){
    //     String str = "hi i am dipesh kardate";
    //     System.out.println(touppercase(str));
    // }


    public static String comparision(String str){
        String newstr = "";

        for (int i = 0; i<str.length();i++){
            Integer count = 1 ;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1) )
                count ++;
                i++;
                newstr+= str.charAt(i);

        if(count>1){
            newstr+=count.toString();
        }

        }             
       


    }
    public static void main(String []arrgs ){
        String str = "aaabbccddd";


    }


}