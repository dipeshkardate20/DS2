// public class oops {

//     public static void main(String []args){
//         Pen p1 = new Pen();
//         p1.setcolor("Blue");
//         System.out.println(p1.color);
//         p1.settip(5);
//         System.out.println(p1.tip);

//         bankaccount myacc =  new bankaccount();
//         myacc.username = "Dipesh";
//         myacc.setpassword ("dkjqh");

//         SECTIONA classdata = new SECTIONA();
//         classdata.stuName = "Dipesh";
//         classdata.stuAge=19;
//         // classdata.fathername = "Sandeep";
//         // classdata.sturoll = 73;


//     }
// }

// class SECTIONA {
//     public String stuName;
//     public int stuAge;

//     private String fathername;
//     private int sturoll;
// }

// class bankaccount{

//     public String username;
//     private String password;
//     public void setpassword( String pwd){
//         password = pwd;
//     }
// }

// public class oops {

//     public static void main(String []args){
//         Pen p1 = new Pen();
//         p1.setcolor("Blue");
//         System.out.println(p1.getcolor());
//         p1.settip(5);
//         System.out.println(p1.gettip());

//     }
// }

class Pen {
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip (int newtip){
        tip = newtip;
    }


  
}

public class oops{
    public static void main(String []args ){
    Student s1 = new Student();
    s1.name = "Dipesh";
    s1.roll = 123;
    s1.password = "ABCD";

    Student s2 = new Student(s1);
    s2.password = "asddasf";
    System.out.println(s2.password);
    System.out.println(s2.name);
    System.out.println(s2.roll);


    
    
    }

    

}

class Student{
    String name ;
    int roll;
    String password;

     

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;




    }


    // yha per ek constructor banega student name ka 
    // usme phir parameter pass hua name nam ka jisse call
    // kiya gya public class me 
    Student( ){
        // the above given student constructor in an 
        // non parametereized consttructor 
         System.out.println("constructor is called...");
    }

    Student(String name ){
        this.name = name;

    }
    Student(int roll ){
        this.roll = roll;


    }


}



