


public class string{

    public static void printLetter(String str){
        for(int i = 0 ; i < str.length() ; i++){
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();

    }

    // public static void main(String[] args) {
    //     // char arr[] = {'a','s','d','f','h'};
    //     // String str1 = "abcd";
    //     // String str2 = new String("XYZ");
    //     // // System.out.println(str2);

    //     //  Strings are immutable 
    //     // means it cannot be changed after the formation 
    //     // String POINT ti remember 

    //     // Scanner sc = new Scanner(System.in);
    //     // String name;
    //     // name = sc.next();

    //     // // System.out.println(name);

    //     // String count = "Dipesh Kardate";
    //     // // System.out.println(count.length());

    //     String firstname = "Dipesh";
    //     String lastname = "kardate";
    //     String fullname = firstname + " " + lastname ;
        



    //     printLetter(fullname);



    // }

    public static boolean palindrome(String str ){
        for(int i = 0 ; i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true ; 
    }

    // public static void main(String[] args) {
    //     String str = "noon";
    //     System.out.println( palindrome(str));

    // }

    public static float getdirection(String path) { 
        int x = 0 ,y =  0 ;
        for(int i = 0 ; i< path.length() ; i++ ){
            char dir  = path.charAt(i) ;

            if (dir == 'S'){
                y--;

            }
            else if (dir == 'W'){
                x--;

            }
            else if (dir == 'N'){
                y++;

            }
            else {
                x++;
            }



        }

        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);

        



    }

    // public static void main(String[] args) {
    //     {
    //         Scanner scanner = new Scanner(System.in);
    //         System.out.println("Please enter your path: ");
    //         String path = scanner.nextLine(); 
    //         float result = getdirection(path);
    //         System.out.println("Shortest distance from the origin: " + result);
    
    //         scanner.close(); 
                // k
    //     }


        
    
    // }

// question no 3 
    //   public static void main(String[] args) {
    //     String fruits[] =  {"apple","banana","mango","orange","grapes"};
    //     String largest = fruits[0];
    //     for(int i = 0 ; i<fruits.length ; i++){
    //         if(largest.compareTo(fruits[i]) < 0){
    //             largest = fruits[i];
    //         }
    //     }
    //     System.out.println(largest);
        
    //   }
    // public static void main(String[] args) {
    //     StringBuilder sb = new StringBuilder("");
    //     for(char ch ='a'; ch<='z'; ch++){
    //         sb.append(ch);
    //     }

    //     // System.out.println(sb);
    //     System.out.println(sb.length());
    // }
    public static String toUppercase(String str){
         StringBuilder sb = new StringBuilder("");
         char ch = Character.toUpperCase(str.charAt(0));
         sb.append(ch);

         for(int i = 1; i<str.length();i++){
            if (str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                
                sb.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            } else {
                sb.append(str.charAt(i));
            }
         }
         return sb.toString();



    }

    // public static void main(String[] args) {
    //     String str = "hi i am dipesh";
    //     System.out.println(toUppercase(str));
    
    // }
    // // more

    public static String compress(String str){
        String newStr = "";
        for(int i=0;i< str.length(); i++){
            Integer count = 1 ;
            while (i<str.length()-1 &&  str.charAt(i) ==  str.charAt(i+1)){
                count++;
                i++;
            }

            newStr += str.charAt(i);
            if(count>1){
                newStr +=count.toString();
            }

        }

        return newStr;
        
    }


    // public static void main(String[] args) {
    //     String str = "aaaabbbbccccddd";
    //     System.out.println(compress(str));
    // }


    // STRING QUESTION 


    // Q1 count vovels in a string 
    
    
    public static String vovelcount(String str ){
        StringBuilder sb = new StringBuilder();
        int count = 0 ;

        for(int i = 0 ; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch =='a' || ch =='e' ||  ch =='i' ||  ch =='o' ||  ch =='u'  ){
                count++;
            }
        }
        return "Vovel count : " + count ; 
         
    }

    // public static void main(String[] args) {
    //     String str = "Dipesh Kardate";
    //     System.out.println(vovelcount(str));
    // }
//  Q2 & q3
    // public static void main(String[] args) {
    //     String str = "Dipesh Kardate";
    //     String str1 = " Kardate";
    //     String str2 = "Dipesh Kardate";
    //     System.out.println(str.equals(str1) + " " + str.equals(str2));
    //     String str4 = "APNACOLLege".replace("g","n");
    //     System.out.println(str4);
    // }

    // q3
    // 
    
    // Q4

    public static String anagrams(String str1,  String str2 ){
        StringBuilder sb = new StringBuilder();


        

    }
    public static void main(String[] args) {
        String str1 = "care" ;
        String str2 = "race";
        System.out.println();

    }




}

    
      
