import java.util.Arrays;
public class stringquestion {

    // public static String countvovel(String str){
    //     // we have to count lowercase vovel mean when ever the vovel ouccured + it should be lowercase 
    //     // we have given string 

    //     // let take a count variable 
    //     // string biulder sb store all the lower case in it 
    //     // we have to remove all the uppercase , blankspace and nonvovels.

    //     StringBuilder sb = new StringBuilder(str);
    //     Integer count = 0;
    //     String vovel = "aeiou";

    //     for(int i = 1;i<str.length();i++){
    //         if(str.charAt(i ) != Character.toUpperCase(str.charAt(i)) && str.charAt(i) != vovel ){

    //         }
    //     }
    // }

    // public static void main(String []args){
    //     String str = "Shraddha didi";
    //     String str1 = "Apnacollege";
    //     String str2 = "Shraddha didi";
    //     System.out.println(str.equals(str1)+ " " + str.equals(str2));
    //     String ch = "Apnacollege".replace("l", "");
    //     System.out.println(ch);
    // }

    // public static void main(String []args ){
    //     String str = "Hi an Dipesh Kardate And i am pround to be an indian";

    // }
 
    public static void anagrams(String str , String str1){
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(str.length() == str1.length()){
            char[] strchararray = str.toCharArray();
            char[] str1chararray = str1.toCharArray();

            Arrays.sort(strchararray);
            Arrays.sort(str1chararray);

            boolean result = Arrays.equals(strchararray,str1chararray);
            if(result == true){
                System.out.println(str1 + " and "+ str1 + "are anagrams of each other .");

            }
            else{
                System.out.println(str1 + " and "+ str1 + "are not anagrams of each other .");
            }

        }

        else{
            System.out.println(str1 + " and "+ str1 + "are not anagrams of each other .");
        }

    }
    public static void main(String []args){
        String str = "take";
        String str1 = "race";
        anagrams(str, str1);
    }

}