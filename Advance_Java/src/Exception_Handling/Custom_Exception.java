package Exception_Handling;
/*
HOW To CREATE CUSTOM EXCEPTION :
1. Create the class with any class name you want
2. EXTEND EXCEPTION CLASS
3. USER KEYWORD TO CALL THE EXCEPTION CLASS/PARENT CLASS CONSTRUCTOR
4. THAT CONSTRUTOR SHUOLD TAKE A PARAMETER.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

class ageLessThanZero extends Exception{
    public ageLessThanZero(String s){
        super(s);

    }
}
public class Custom_Exception {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the dividend");
        int b =sc.nextInt();

        int a= 0;
//        if b = is less than 0 show and exeption
//        throw== is a kewyword which uesd to explicitly thoroq an exception

            try {
                if (b < 0) {
                    throw new ageLessThanZero("age is less than zero ");

                }else{
                        a= 10/b;
                    }


             }
            catch (ageLessThanZero e) {
                System.out.println(e.getMessage());
                e.printStackTrace();

            }


    }


}